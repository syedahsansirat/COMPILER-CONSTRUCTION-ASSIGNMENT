%{
	#include <stdio.h>
	#include <stdlib.h>
	#include <string.h>
	
	void yyerror (const char *);
	
%}

%token DOUBLE

%left '+' '-'
%left '*' '/'
%error_verbose

%%

program: program E '\n' {
							printf("%lf\n",$2);
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
	DOUBLE	{
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

