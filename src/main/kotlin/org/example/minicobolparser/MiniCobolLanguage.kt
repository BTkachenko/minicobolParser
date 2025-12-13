package org.example.minicobolparser

import com.intellij.lang.Language
import org.example.minicobolparser.MiniCobolLanguage.ID

/**
 * Defines the MiniCobol language for IntelliJ Platform.
 */
object MiniCobolLanguage : Language(ID) {
    private fun readResolve(): Any = MiniCobolLanguage

    const val ID: String = "MiniCobol"
}
