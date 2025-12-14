package org.example.minicobolparser

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider

/**
 * PSI representation of a MiniCobol file.
 */
class MiniCobolFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, MiniCobolLanguage) {

    override fun getFileType() = MiniCobolFileType.INSTANCE

    override fun toString(): String = "MiniCobol File"
}
