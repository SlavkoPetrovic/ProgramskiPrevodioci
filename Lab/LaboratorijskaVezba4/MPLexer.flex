// import sekcija
import java_cup.runtime.*;

%%

// sekcija opcija i deklaracija
%class MPLexer

%cup

%line
%column


%eofval{
	return new Symbol( sym.EOF );
%eofval}



%{
    public int getLine()
    {
        return yyline;
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
\( { return new Symbol( sym.LEFTPAR); }
\) { return new Symbol( sym.RIGHTPAR); }

//operatori
\. { return new Symbol( sym.DOT); }
:= { return new Symbol( sym.ASSIGN); }
\< { return new Symbol( sym.LT); }
\<= { return new Symbol( sym.LE); }
== { return new Symbol( sym.EQ); }
\<> { return new Symbol( sym.NE); }
> { return new Symbol( sym.GT); }
>= { return new Symbol( sym.GE); }
and { return new Symbol( sym.AND); }
or { return new Symbol( sym.OR); }
=> { return new Symbol( sym.ARROW); }
//separatori
; { return new Symbol( sym.SEMICOLON); }
: { return new Symbol( sym.COLON); }
, { return new Symbol( sym.COMMA); }
//kljucne reci

"program" { return new Symbol( sym.PROGRAM );	}
"begin" { return new Symbol( sym.BEGIN );	}
"end" { return new Symbol( sym.END );	}
"integer" { return new Symbol( sym.INTCONST );	}
"char" { return new Symbol( sym.CHARCONST );	}
"real" { return new Symbol( sym.REALCONST );	}
"boolean" { return new Symbol( sym.BOOLCONST );	}
"select" { return new Symbol( sym.SELECT );	}
"case" { return new Symbol( sym.CASE );	}

"true"|"false" {return new Symbol(sym.BOOLCONST, new Boolean( yytext() ) ); }




(({slovo}|[$])({slovo}|{cifra}|[$])*) { return new Symbol(sym.ID, yytext() ); }





((([0x]{1}{hex}+)|[0]{1}{cifra}+)|({cifra}+)) {return new Symbol(sym.INTCONST, (new Integer( yytext() ) )); }
(({cifra}+\.({cifra}+)?(E(\+|\-)?{cifra}+)?)|(\.{cifra}+(E(\+|\-)?{cifra}+)?)) { return new Symbol(sym.REALCONST, (new Double( yytext()) ) ); }
(\'({slovo}{1}|{cifra}{1}|{znak}{1})\') { return new Symbol( sym.CHARCONST, new Character( yytext().charAt(1) )); }

//obrada greske
.  { if (yytext() != null && yytext().length() > 0) System.out.println( "Error at ln: " + yyline + ", column: " + yycolumn + " -- " + yytext() ); }
