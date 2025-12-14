package org.example.minicobolparser.psi

import com.intellij.psi.tree.IElementType
import org.example.minicobolparser.MiniCobolLanguage

class MiniCobolTokenType(debugName: String) : IElementType(debugName, MiniCobolLanguage) {

    override fun toString(): String = "MiniCobolTokenType." + super.toString()
}