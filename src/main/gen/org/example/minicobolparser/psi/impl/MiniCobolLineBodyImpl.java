// This is a generated file. Not intended for manual editing.
package org.example.minicobolparser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.example.minicobolparser.psi.MiniCobolTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.example.minicobolparser.psi.*;

public class MiniCobolLineBodyImpl extends ASTWrapperPsiElement implements MiniCobolLineBody {

  public MiniCobolLineBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MiniCobolVisitor visitor) {
    visitor.visitLineBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MiniCobolVisitor) accept((MiniCobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MiniCobolDataDescriptionEntry getDataDescriptionEntry() {
    return findChildByClass(MiniCobolDataDescriptionEntry.class);
  }

  @Override
  @Nullable
  public MiniCobolDataDivisionHeader getDataDivisionHeader() {
    return findChildByClass(MiniCobolDataDivisionHeader.class);
  }

  @Override
  @Nullable
  public MiniCobolIdentificationDivisionHeader getIdentificationDivisionHeader() {
    return findChildByClass(MiniCobolIdentificationDivisionHeader.class);
  }

  @Override
  @Nullable
  public MiniCobolParagraphHeader getParagraphHeader() {
    return findChildByClass(MiniCobolParagraphHeader.class);
  }

  @Override
  @Nullable
  public MiniCobolProcedureDivisionHeader getProcedureDivisionHeader() {
    return findChildByClass(MiniCobolProcedureDivisionHeader.class);
  }

  @Override
  @Nullable
  public MiniCobolProgramIdHeader getProgramIdHeader() {
    return findChildByClass(MiniCobolProgramIdHeader.class);
  }

  @Override
  @Nullable
  public MiniCobolStatementLine getStatementLine() {
    return findChildByClass(MiniCobolStatementLine.class);
  }

  @Override
  @Nullable
  public MiniCobolWorkingStorageSectionHeader getWorkingStorageSectionHeader() {
    return findChildByClass(MiniCobolWorkingStorageSectionHeader.class);
  }

}
