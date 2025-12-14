// This is a generated file. Not intended for manual editing.
package org.example.minicobolparser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MiniCobolPerformVaryingPhrase extends PsiElement {

  @NotNull
  MiniCobolCondition getCondition();

  @NotNull
  MiniCobolPerformBy getPerformBy();

  @NotNull
  MiniCobolPerformFrom getPerformFrom();

  @Nullable
  MiniCobolPerformTestPhrase getPerformTestPhrase();

}
