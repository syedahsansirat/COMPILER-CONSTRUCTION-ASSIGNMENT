%option noyywrap


%%
exit return 0;
a(a|b)*a printf("(a) Exercise 3.3.2\n");
((e|a)b*)* printf("(b) Exercise 3.3.2\n");
(a|b)*a(a|b)(a|b) printf("(c) Exercise 3.3.2\n");
a*ba*ba*ba* printf("(d) Exercise 3.3.2\n");
(aa|bb)*((ab|ba)(aa|bb)*(ab|ba)(aa|bb)*)* printf("(e) Exercise 3.3.2\n");
. ;
\n ;
%%

int main()
{
	yylex();
	return 0;
}