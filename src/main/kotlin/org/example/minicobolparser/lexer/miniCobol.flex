package org.example.minicobolparser.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
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

%x AFTER_PIC

WHITE_SPACE = [ \t\f]+
NEWLINE     = \r\n|\r|\n

DIGIT       = [0-9]
INTEGER_RX  = {DIGIT}+

IDENT       = [A-Za-z][A-Za-z0-9-]*
STRING      = \'[^\r\n\']*\'

/* picture-string auxiliaries (per documentation) */
PIC_CURRENCY_RX = [^0-9ABCDPRSVXZa-z\*\+\-\/\,\.\;\(\)\=\'\"\ \n]
PICCHAR_RX      = ("CR"|"DB"|[ABEGPSVXZabegpsvxz90\+\-\*\$])
PUNCT_RX        = [\/\,\.\:]

%{
  private boolean atLineStart = true;
  private boolean pictureStarted = false;
%}

%%

/* whitespace/newline only in normal mode */
<YYINITIAL>{WHITE_SPACE}                   { return TokenType.WHITE_SPACE; }
<YYINITIAL>{NEWLINE}                       { atLineStart = true; return TokenType.WHITE_SPACE; }

/* Any integer at the beginning of a physical line is a line number */
<YYINITIAL>{INTEGER_RX} {
  if (atLineStart) {
    atLineStart = false;
    return LINE_NUMBER;
  }
  atLineStart = false;
  return INTEGER;
}

<YYINITIAL>">="                            { atLineStart = false; return GE; }
<YYINITIAL>"<="                            { atLineStart = false; return LE; }
<YYINITIAL>">"                             { atLineStart = false; return GT; }
<YYINITIAL>"<"                             { atLineStart = false; return LT; }
<YYINITIAL>"="                             { atLineStart = false; return EQ; }
<YYINITIAL>"."                             { atLineStart = false; return DOT; }
<YYINITIAL>"("                             { atLineStart = false; return LPAREN; }
<YYINITIAL>")"                             { atLineStart = false; return RPAREN; }

<YYINITIAL>"IDENTIFICATION"                { atLineStart = false; return IDENTIFICATION; }
<YYINITIAL>"DIVISION"                      { atLineStart = false; return DIVISION; }
<YYINITIAL>"PROGRAM-ID"                    { atLineStart = false; return PROGRAM_ID; }
<YYINITIAL>"DATA"                          { atLineStart = false; return DATA; }
<YYINITIAL>"WORKING-STORAGE"               { atLineStart = false; return WORKING_STORAGE; }
<YYINITIAL>"SECTION"                       { atLineStart = false; return SECTION; }
<YYINITIAL>"PROCEDURE"                     { atLineStart = false; return PROCEDURE; }

<YYINITIAL>"PIC"                           { atLineStart = false; pictureStarted = false; yybegin(AFTER_PIC); return PIC; }
<YYINITIAL>"PICTURE"                       { atLineStart = false; pictureStarted = false; yybegin(AFTER_PIC); return PICTURE; }

<YYINITIAL>"VALUE"                         { atLineStart = false; return VALUE; }

<YYINITIAL>"PERFORM"                       { atLineStart = false; return PERFORM; }
<YYINITIAL>"VARYING"                       { atLineStart = false; return VARYING; }
<YYINITIAL>"FROM"                          { atLineStart = false; return FROM; }
<YYINITIAL>"BY"                            { atLineStart = false; return BY; }
<YYINITIAL>"UNTIL"                         { atLineStart = false; return UNTIL; }

<YYINITIAL>"WITH"                          { atLineStart = false; return WITH; }
<YYINITIAL>"TEST"                          { atLineStart = false; return TEST; }
<YYINITIAL>"BEFORE"                        { atLineStart = false; return BEFORE; }
<YYINITIAL>"AFTER"                         { atLineStart = false; return AFTER; }

<YYINITIAL>"STOP"                          { atLineStart = false; return STOP; }
<YYINITIAL>"RUN"                           { atLineStart = false; return RUN; }

<YYINITIAL>"DISPLAY"                       { atLineStart = false; return DISPLAY; }
<YYINITIAL>"UPON"                          { atLineStart = false; return UPON; }
<YYINITIAL>"NO"                            { atLineStart = false; return NO; }
<YYINITIAL>"ADVANCING"                     { atLineStart = false; return ADVANCING; }

<YYINITIAL>"IS"                            { atLineStart = false; return IS; }
<YYINITIAL>"NOT"                           { atLineStart = false; return NOT; }
<YYINITIAL>"GREATER"                       { atLineStart = false; return GREATER; }
<YYINITIAL>"LESS"                          { atLineStart = false; return LESS; }
<YYINITIAL>"THAN"                          { atLineStart = false; return THAN; }
<YYINITIAL>"EQUAL"                         { atLineStart = false; return EQUAL; }
<YYINITIAL>"TO"                            { atLineStart = false; return TO; }
<YYINITIAL>"AND"                           { atLineStart = false; return AND; }
<YYINITIAL>"OR"                            { atLineStart = false; return OR; }

<YYINITIAL>{STRING}                        { atLineStart = false; return STRING; }
<YYINITIAL>{IDENT}                         { atLineStart = false; return IDENTIFIER; }

/* AFTER_PIC: tokenize picture-string pieces */
<AFTER_PIC>{WHITE_SPACE} {
  if (pictureStarted) {
    yybegin(YYINITIAL);
  }
  return TokenType.WHITE_SPACE;
}

<AFTER_PIC>{NEWLINE} {
  atLineStart = true;
  pictureStarted = false;
  yybegin(YYINITIAL);
  return TokenType.WHITE_SPACE;
}

/* optional IS inside picture-clause */
<AFTER_PIC>"IS"                             { atLineStart = false; return IS; }

/* picchar */
<AFTER_PIC>{PICCHAR_RX}                     { pictureStarted = true; atLineStart = false; return PICCHAR; }

/* currency? */
<AFTER_PIC>{PIC_CURRENCY_RX}                { pictureStarted = true; atLineStart = false; return CURRENCY; }

/* punctuation */
<AFTER_PIC>{PUNCT_RX}                       { pictureStarted = true; atLineStart = false; return PUNCTUATION; }

/* repeat = "(" [0-9]+ ")" */
<AFTER_PIC>"("                              { pictureStarted = true; atLineStart = false; return LPAREN; }
<AFTER_PIC>")"                              { pictureStarted = true; atLineStart = false; return RPAREN; }
<AFTER_PIC>{INTEGER_RX}                     { pictureStarted = true; atLineStart = false; return INTEGER; }

<AFTER_PIC>[^] {
  pictureStarted = false;
  yybegin(YYINITIAL);
  return TokenType.BAD_CHARACTER;
}

<YYINITIAL>[^]                              { atLineStart = false; return TokenType.BAD_CHARACTER; }
