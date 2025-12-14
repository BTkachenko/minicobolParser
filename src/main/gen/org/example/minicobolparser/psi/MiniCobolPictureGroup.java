// This is a generated file. Not intended for manual editing.
package org.example.minicobolparser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MiniCobolPictureGroup extends PsiElement {

  @NotNull
  List<MiniCobolPicChar> getPicCharList();

  @Nullable
  MiniCobolRepeat getRepeat();

}
