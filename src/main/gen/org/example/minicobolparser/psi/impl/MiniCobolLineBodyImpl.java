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
  public MiniCobolDataDecl getDataDecl() {
    return findChildByClass(MiniCobolDataDecl.class);
  }

  @Override
  @Nullable
  public MiniCobolDataDivision getDataDivision() {
    return findChildByClass(MiniCobolDataDivision.class);
  }

  @Override
  @Nullable
  public MiniCobolIdentificationDivision getIdentificationDivision() {
    return findChildByClass(MiniCobolIdentificationDivision.class);
  }

  @Override
  @Nullable
  public MiniCobolParagraph getParagraph() {
    return findChildByClass(MiniCobolParagraph.class);
  }

  @Override
  @Nullable
  public MiniCobolProcedureDivision getProcedureDivision() {
    return findChildByClass(MiniCobolProcedureDivision.class);
  }

  @Override
  @Nullable
  public MiniCobolProgramId getProgramId() {
    return findChildByClass(MiniCobolProgramId.class);
  }

  @Override
  @Nullable
  public MiniCobolStatement getStatement() {
    return findChildByClass(MiniCobolStatement.class);
  }

  @Override
  @Nullable
  public MiniCobolWorkingStorageSection getWorkingStorageSection() {
    return findChildByClass(MiniCobolWorkingStorageSection.class);
  }

}
