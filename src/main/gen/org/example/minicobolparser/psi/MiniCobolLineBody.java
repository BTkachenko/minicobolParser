// This is a generated file. Not intended for manual editing.
package org.example.minicobolparser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MiniCobolLineBody extends PsiElement {

  @Nullable
  MiniCobolDataDescriptionEntry getDataDescriptionEntry();

  @Nullable
  MiniCobolDataDivisionHeader getDataDivisionHeader();

  @Nullable
  MiniCobolIdentificationDivisionHeader getIdentificationDivisionHeader();

  @Nullable
  MiniCobolParagraphHeader getParagraphHeader();

  @Nullable
  MiniCobolProcedureDivisionHeader getProcedureDivisionHeader();

  @Nullable
  MiniCobolProgramIdHeader getProgramIdHeader();

  @Nullable
  MiniCobolStatementLine getStatementLine();

  @Nullable
  MiniCobolWorkingStorageSectionHeader getWorkingStorageSectionHeader();

}
