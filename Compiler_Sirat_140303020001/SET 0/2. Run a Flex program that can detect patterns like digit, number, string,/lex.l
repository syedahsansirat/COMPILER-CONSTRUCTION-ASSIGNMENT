%option noyywrap
digit [0-9]
letter_ [a-zA-Z_]
number {digit}+
dot [.]

%%
exit return 0;
{digit} printf("DIGIT\n");
{letter_}({letter_}|{digit})+ printf("IDENTIFIER\n");
{number} printf("NUMBER\n");
. ;
\n ;
%%

int main()
{
	yylex();
	return 0;
}