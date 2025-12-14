package org.example.minicobolparser

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.example.minicobolparser.lexer.MiniCobolLexerAdapter
import org.example.minicobolparser.parser.MiniCobolParser
import org.example.minicobolparser.psi.MiniCobolTypes

/**
 * Wires lexer + parser + PSI for MiniCobol.
 */
class MiniCobolParserDefinition : ParserDefinition {

    companion object {
        private val FILE: IFileElementType = IFileElementType(MiniCobolLanguage)
        private val WHITE_SPACES: TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
        private val COMMENTS: TokenSet = TokenSet.EMPTY
        private val STRINGS: TokenSet = TokenSet.create(MiniCobolTypes.STRING)
    }

    override fun createLexer(project: Project?): Lexer = MiniCobolLexerAdapter()

    override fun createParser(project: Project?): PsiParser = MiniCobolParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getWhitespaceTokens(): TokenSet = WHITE_SPACES

    override fun getCommentTokens(): TokenSet = COMMENTS

    override fun getStringLiteralElements(): TokenSet = STRINGS

    override fun createElement(node: ASTNode): PsiElement = MiniCobolTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = MiniCobolFile(viewProvider)

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements =
        ParserDefinition.SpaceRequirements.MAY
}