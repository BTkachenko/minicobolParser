// This is a generated file. Not intended for manual editing.
package org.example.minicobolparser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MiniCobolDisplayStatement extends PsiElement {

  @Nullable
  MiniCobolDisplayAdvancingPhrase getDisplayAdvancingPhrase();

  @NotNull
  List<MiniCobolDisplayOperand> getDisplayOperandList();

  @Nullable
  MiniCobolDisplayUponPhrase getDisplayUponPhrase();

}
