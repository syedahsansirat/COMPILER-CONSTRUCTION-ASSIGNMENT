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
dot [.]
%%

{number}({dot}{number})?(E[+-]?{number})? {
			char *c=strdup(yytext);
			yylval=atof(c);
			return DOUBLE;
		 } 
{op} {		 
		char *c=strdup(yytext);
		return *c;
	}
[ \t]+
		 
%%

