package org.example.minicobolparser.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static org.example.minicobolparser.psi.MiniCobolTypes.*;

%%

%public
%class _MiniCobolLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%ignorecase

WHITE_SPACE = [ \t\f]+
NEWLINE     = \r\n|\r|\n
INT         = [0-9]+
IDENT       = [A-Za-z][A-Za-z0-9-]*
STRING      = \'[^\r\n\']*\'

%%

{WHITE_SPACE}   { return com.intellij.psi.TokenType.WHITE_SPACE; }
{NEWLINE}       { return com.intellij.psi.TokenType.WHITE_SPACE; }

"."             { return DOT; }
"("             { return LPAREN; }
")"             { return RPAREN; }
"="             { return EQ; }

"IDENTIFICATION"    { return IDENTIFICATION; }
"DIVISION"          { return DIVISION; }
"PROGRAM-ID"        { return PROGRAM_ID; }
"DATA"              { return DATA; }
"WORKING-STORAGE"   { return WORKING_STORAGE; }
"SECTION"           { return SECTION; }
"PROCEDURE"         { return PROCEDURE; }

"PIC"               { return PIC; }
"VALUE"             { return VALUE; }

"PERFORM"           { return PERFORM; }
"VARYING"           { return VARYING; }
"FROM"              { return FROM; }
"BY"                { return BY; }
"UNTIL"             { return UNTIL; }

"STOP"              { return STOP; }
"RUN"               { return RUN; }
"DISPLAY"           { return DISPLAY; }

"9"                 { return DIGIT9; }

{STRING}            { return STRING; }
{INT}               { return INT; }
{IDENT}             { return IDENTIFIER; }

[^]                 { return com.intellij.psi.TokenType.BAD_CHARACTER; }
