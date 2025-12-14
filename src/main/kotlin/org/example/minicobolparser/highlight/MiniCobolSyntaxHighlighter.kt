package org.example.minicobolparser.highlight

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import org.example.minicobolparser.lexer.MiniCobolLexerAdapter
import org.example.minicobolparser.psi.MiniCobolTypes

class MiniCobolSyntaxHighlighter : SyntaxHighlighter {
    override fun getHighlightingLexer(): Lexer = MiniCobolLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> =
        when (tokenType) {
            TokenType.BAD_CHARACTER -> pack(BAD_CHAR)

            MiniCobolTypes.LINE_NUMBER -> pack(LINE_NUMBER)
            MiniCobolTypes.INTEGER -> pack(NUMBER)
            MiniCobolTypes.STRING -> pack(STRING)
            MiniCobolTypes.PICTURE_STRING -> pack(PICTURE_STRING)

            MiniCobolTypes.DOT,
            MiniCobolTypes.EQ,
            MiniCobolTypes.GT,
            MiniCobolTypes.LT,
            MiniCobolTypes.GE,
            MiniCobolTypes.LE,
            MiniCobolTypes.LPAREN,
            MiniCobolTypes.RPAREN -> pack(OPERATOR)

            MiniCobolTypes.IDENTIFICATION,
            MiniCobolTypes.DIVISION,
            MiniCobolTypes.PROGRAM_ID,
            MiniCobolTypes.DATA,
            MiniCobolTypes.WORKING_STORAGE,
            MiniCobolTypes.SECTION,
            MiniCobolTypes.PROCEDURE,
            MiniCobolTypes.PIC,
            MiniCobolTypes.PICTURE,
            MiniCobolTypes.VALUE,
            MiniCobolTypes.PERFORM,
            MiniCobolTypes.VARYING,
            MiniCobolTypes.FROM,
            MiniCobolTypes.BY,
            MiniCobolTypes.UNTIL,
            MiniCobolTypes.WITH,
            MiniCobolTypes.TEST,
            MiniCobolTypes.BEFORE,
            MiniCobolTypes.AFTER,
            MiniCobolTypes.STOP,
            MiniCobolTypes.RUN,
            MiniCobolTypes.DISPLAY,
            MiniCobolTypes.UPON,
            MiniCobolTypes.NO,
            MiniCobolTypes.ADVANCING,
            MiniCobolTypes.IS,
            MiniCobolTypes.NOT,
            MiniCobolTypes.GREATER,
            MiniCobolTypes.LESS,
            MiniCobolTypes.THAN,
            MiniCobolTypes.EQUAL,
            MiniCobolTypes.TO,
            MiniCobolTypes.AND,
            MiniCobolTypes.OR -> pack(KEYWORD)

            MiniCobolTypes.IDENTIFIER -> pack(IDENTIFIER)

            TokenType.WHITE_SPACE -> EMPTY_KEYS
            else -> EMPTY_KEYS
        }

    companion object {
        val EMPTY_KEYS: Array<TextAttributesKey> = emptyArray()

        val KEYWORD: TextAttributesKey =
            TextAttributesKey.createTextAttributesKey("MINICOBOL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)

        val IDENTIFIER: TextAttributesKey =
            TextAttributesKey.createTextAttributesKey("MINICOBOL_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)

        val NUMBER: TextAttributesKey =
            TextAttributesKey.createTextAttributesKey("MINICOBOL_NUMBER", DefaultLanguageHighlighterColors.NUMBER)

        val LINE_NUMBER: TextAttributesKey =
            TextAttributesKey.createTextAttributesKey("MINICOBOL_LINE_NUMBER", DefaultLanguageHighlighterColors.LINE_COMMENT)

        val STRING: TextAttributesKey =
            TextAttributesKey.createTextAttributesKey("MINICOBOL_STRING", DefaultLanguageHighlighterColors.STRING)

        val PICTURE_STRING: TextAttributesKey =
            TextAttributesKey.createTextAttributesKey("MINICOBOL_PICTURE_STRING", DefaultLanguageHighlighterColors.STRING)

        val OPERATOR: TextAttributesKey =
            TextAttributesKey.createTextAttributesKey("MINICOBOL_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)

        val BAD_CHAR: TextAttributesKey =
            TextAttributesKey.createTextAttributesKey("MINICOBOL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

        fun pack(key: TextAttributesKey): Array<TextAttributesKey> = arrayOf(key)
    }
}
