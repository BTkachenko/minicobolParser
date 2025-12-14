// This is a generated file. Not intended for manual editing.
package org.example.minicobolparser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MiniCobolLineBody extends PsiElement {

  @Nullable
  MiniCobolDataDecl getDataDecl();

  @Nullable
  MiniCobolDataDivision getDataDivision();

  @Nullable
  MiniCobolIdentificationDivision getIdentificationDivision();

  @Nullable
  MiniCobolParagraph getParagraph();

  @Nullable
  MiniCobolProcedureDivision getProcedureDivision();

  @Nullable
  MiniCobolProgramId getProgramId();

  @Nullable
  MiniCobolStatement getStatement();

  @Nullable
  MiniCobolWorkingStorageSection getWorkingStorageSection();

}
