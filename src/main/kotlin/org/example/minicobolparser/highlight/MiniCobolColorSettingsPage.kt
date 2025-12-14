package org.example.minicobolparser.highlight

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor.EMPTY_ARRAY
import com.intellij.openapi.options.colors.ColorSettingsPage
import org.example.minicobolparser.MiniCobolIcons
import javax.swing.Icon

class MiniCobolColorSettingsPage : ColorSettingsPage {

    override fun getIcon(): Icon = MiniCobolIcons.FILE

    override fun getHighlighter(): SyntaxHighlighter = MiniCobolSyntaxHighlighter()

    override fun getDemoText(): String =
        """
        01 IDENTIFICATION DIVISION.
        02 PROGRAM-ID. HELLO.
        03 DATA DIVISION.
        04 WORKING-STORAGE SECTION.
        05 01 WS-A PIC 9(2) VALUE 0.
        06 PROCEDURE DIVISION.
        07 A-PARA.
        08 PERFORM B-PARA VARYING WS-A FROM 2 BY 2 UNTIL WS-A=12
        09 STOP RUN.
        10 B-PARA.
        11 DISPLAY 'B-PARA ' WS-A.
        12 DISPLAY 'B-PARA'.
        """.trimIndent()

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? = null

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> = arrayOf(
        AttributesDescriptor("Keyword", MiniCobolSyntaxHighlighter.KEYWORD),
        AttributesDescriptor("Identifier", MiniCobolSyntaxHighlighter.IDENTIFIER),
        AttributesDescriptor("Number", MiniCobolSyntaxHighlighter.NUMBER),
        AttributesDescriptor("String", MiniCobolSyntaxHighlighter.STRING),
        AttributesDescriptor("Operator/Punctuation", MiniCobolSyntaxHighlighter.OPERATOR),
        AttributesDescriptor("Bad character", MiniCobolSyntaxHighlighter.BAD_CHAR),
    )

    override fun getColorDescriptors(): Array<ColorDescriptor> = EMPTY_ARRAY

    override fun getDisplayName(): String = "MiniCobol"
}