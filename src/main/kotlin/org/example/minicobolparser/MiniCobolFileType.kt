package org.example.minicobolparser
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class MiniCobolFileType private constructor(): LanguageFileType(MiniCobolLanguage) {
    override fun getName(): String = "MiniCobol"
    override fun getDescription(): String = "MiniCobol File"

    override fun getDefaultExtension(): String = "cbl"

    override fun getIcon(): Icon = MiniCobolIcons.FILE
    companion object {
        @JvmField
        val INSTANCE = MiniCobolFileType()
    }
}