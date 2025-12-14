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

public class MiniCobolSimpleConditionImpl extends ASTWrapperPsiElement implements MiniCobolSimpleCondition {

  public MiniCobolSimpleConditionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MiniCobolVisitor visitor) {
    visitor.visitSimpleCondition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MiniCobolVisitor) accept((MiniCobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MiniCobolCondition getCondition() {
    return findChildByClass(MiniCobolCondition.class);
  }

  @Override
  @Nullable
  public MiniCobolRelationCondition getRelationCondition() {
    return findChildByClass(MiniCobolRelationCondition.class);
  }

}
