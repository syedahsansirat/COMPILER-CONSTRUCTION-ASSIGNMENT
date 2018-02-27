%option noyywrap

digit [0-9]
letter [a-zA-Z]
number {digit}+
dot [.]


%%
exit return 0;
({letter}|{digit})+({letter}|{digit}|{dot})*@{letter}+{dot}com printf("EMAIL ADDRESS\n");
{digit}+({dot}{digit}+)?(E[+-]?{digit}+)? printf("FLOAT OR DOUBLE\n");
(if|else|switch) printf("if/else/switch keyword\n");
. ;
\n ;
%%

int main()
{
	yylex();
	return 0;
}