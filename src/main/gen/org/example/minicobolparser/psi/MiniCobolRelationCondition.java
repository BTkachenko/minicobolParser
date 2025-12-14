// This is a generated file. Not intended for manual editing.
package org.example.minicobolparser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MiniCobolRelationCondition extends PsiElement {

  @NotNull
  List<MiniCobolArithmeticExpression> getArithmeticExpressionList();

  @NotNull
  MiniCobolRelationalOperator getRelationalOperator();

}
