// import sekcija

%%

// sekcija opcija i deklaracija
%class MPLexer
%function next_token
%line
%column
%debug
%type Yytoken

%eofval{
//return new Yytoken( sym.EOF, null, yyline, yycolumn);
%eofval}

%{
//dodatni clanovi generisane klase
KWTable kwTable = new KWTable();
Yytoken getKW()
{
	return new Yytoken( kwTable.find( yytext() ),
	yytext(), yyline, yycolumn );
}
%}

//stanja
%xstate KOMENTAR
//makroi
slovo = [a-zA-Z]
cifra = [0-9]
hex = [0 1 2 3 4 5 6 7 8 9 a A b B c C d D e E f F]
znak = [\/ \* \- \+ ; , : \. _ \? ' \" # $ % & \( \) = \\ \| \[ \] @ \{ \} > \<]


%%

// pravila
"|*" { yybegin( KOMENTAR ); }
<KOMENTAR>~"*|" { yybegin( YYINITIAL ); }

[\t\n\r\ ] { ; }
\( { return new Yytoken( sym.LEFTPAR, yytext(), yyline, yycolumn ); }
\) { return new Yytoken( sym.RIGHTPAR, yytext(), yyline, yycolumn ); }

//operatori
//\+ { return new Yytoken( sym.PLUS,yytext(), yyline, yycolumn ); }
//\* { return new Yytoken( sym.MUL,yytext(), yyline, yycolumn ); }
//\. { return new Yytoken( sym.DOT, yytext(), yyline, yycolumn ); }
:= { return new Yytoken( sym.ASSIGN, yytext(), yyline, yycolumn ); }
\< { return new Yytoken( sym.LT,yytext(), yyline ,yycolumn ); }
\<= { return new Yytoken( sym.LE,yytext(), yyline ,yycolumn ); }
== { return new Yytoken( sym.EQ,yytext(), yyline ,yycolumn ); }
\<> { return new Yytoken( sym.NE,yytext(), yyline ,yycolumn ); }
> { return new Yytoken( sym.GT,yytext(), yyline ,yycolumn ); }
>= { return new Yytoken( sym.GE,yytext(), yyline ,yycolumn ); }
and { return new Yytoken( sym.AND,yytext(), yyline, yycolumn ); }
or { return new Yytoken( sym.OR,yytext(), yyline, yycolumn ); }
=> { return new Yytoken( sym.ARROW,yytext(), yyline, yycolumn ); }
//separatori
; { return new Yytoken( sym.SEMICOLON, yytext(), yyline, yycolumn ); }
: { return new Yytoken( sym.COLON, yytext(), yyline, yycolumn ); }
, { return new Yytoken( sym.COMMA, yytext(), yyline, yycolumn ); }


(true|false) {return new Yytoken(sym.CONST,yytext(),yyline,yycolumn);}
//kljucne reci
{slovo}+ { return getKW(); }

//identifikatori
(({slovo}|[$])({slovo}|{cifra}|[$])*) { return new Yytoken(sym.ID, yytext(), yyline, yycolumn ); }


//konstante
(\'({slovo}{1}|{cifra}{1}|{znak}{1})\') { return new Yytoken( sym.CHAR, yytext(), yyline, yycolumn ); }
((([0x]{1}{hex}+)|[0]{1}{cifra}+)|({cifra}+)) {return new Yytoken(sym.INTEGER, yytext(), yyline, yycolumn); }
(({cifra}+\.({cifra}+)?(E(\+|\-)?{cifra}+)?)|(\.{cifra}+(E(\+|\-)?{cifra}+)?)) { return new Yytoken(sym.REAL, yytext(), yyline, yycolumn); }

//obrada gresaka
. { if (yytext() != null && yytext().length() > 0) System.out.println( "ERROR: " + yytext() ); }
