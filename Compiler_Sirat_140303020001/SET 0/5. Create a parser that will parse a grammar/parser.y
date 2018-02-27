%{
	#include <stdio.h>
	#include <stdlib.h>
	#include <string.h>
	
	void yyerror (const char *);
	
%}

%token INTEGER

%left '+' '-'
%left '*' '/'
%error_verbose

%%

program: program E '\n' {
							printf("%d\n",$2);
						}
					|;
					
E: E '+' E	{
				$$=$1+$3;
			}
		|
   E '-' E	{
				$$=$1-$3;
			}
		|
   E '*' E	{
				$$=$1*$3;
			}
		|
   E '/' E	{
				$$=$1/$3;
			}
		|
	INTEGER	{
				$$=$1;
			}
		;
%%


int main()
{
	yyparse();
	return 0;
}

void yyerror(const char *c){
	printf("%s\n",c);
	return;
}

