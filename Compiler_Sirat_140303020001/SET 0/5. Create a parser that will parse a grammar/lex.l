%{
	#include <stdio.h>
	#include <stdlib.h>
	#include <string.h>
	#include "parser.h"
%}


%option noyywrap

digit [0-9]
number {digit}+
op [-+*/\n]

%%

{number} {
			char *c=strdup(yytext);
			yylval=atoi(c);
			return INTEGER;
		 } 
{op} {		 
		char *c=strdup(yytext);
		return *c;
	}
[ \t]+
		 
%%

