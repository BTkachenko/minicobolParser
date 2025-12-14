// This is a generated file. Not intended for manual editing.
package org.example.minicobolparser.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.example.minicobolparser.psi.impl.*;

public interface MiniCobolTypes {

  IElementType CONDITION = new MiniCobolElementType("CONDITION");
  IElementType DATA_DECL = new MiniCobolElementType("DATA_DECL");
  IElementType DATA_DIVISION = new MiniCobolElementType("DATA_DIVISION");
  IElementType DISPLAY_OPERAND = new MiniCobolElementType("DISPLAY_OPERAND");
  IElementType DISPLAY_STMT = new MiniCobolElementType("DISPLAY_STMT");
  IElementType IDENTIFICATION_DIVISION = new MiniCobolElementType("IDENTIFICATION_DIVISION");
  IElementType LEVEL_NUMBER = new MiniCobolElementType("LEVEL_NUMBER");
  IElementType LINE_BODY = new MiniCobolElementType("LINE_BODY");
  IElementType LINE_NUMBER = new MiniCobolElementType("LINE_NUMBER");
  IElementType PARAGRAPH = new MiniCobolElementType("PARAGRAPH");
  IElementType PERFORM_STMT = new MiniCobolElementType("PERFORM_STMT");
  IElementType PICTURE = new MiniCobolElementType("PICTURE");
  IElementType PROCEDURE_DIVISION = new MiniCobolElementType("PROCEDURE_DIVISION");
  IElementType PROGRAM_ID = new MiniCobolElementType("PROGRAM_ID");
  IElementType STATEMENT = new MiniCobolElementType("STATEMENT");
  IElementType STOP_STMT = new MiniCobolElementType("STOP_STMT");
  IElementType VALUE_CLAUSE = new MiniCobolElementType("VALUE_CLAUSE");
  IElementType WORKING_STORAGE_SECTION = new MiniCobolElementType("WORKING_STORAGE_SECTION");

  IElementType BY = new MiniCobolTokenType("BY");
  IElementType DATA = new MiniCobolTokenType("DATA");
  IElementType DIGIT9 = new MiniCobolTokenType("DIGIT9");
  IElementType DISPLAY = new MiniCobolTokenType("DISPLAY");
  IElementType DIVISION = new MiniCobolTokenType("DIVISION");
  IElementType DOT = new MiniCobolTokenType("DOT");
  IElementType EQ = new MiniCobolTokenType("EQ");
  IElementType FROM = new MiniCobolTokenType("FROM");
  IElementType IDENTIFICATION = new MiniCobolTokenType("IDENTIFICATION");
  IElementType IDENTIFIER = new MiniCobolTokenType("IDENTIFIER");
  IElementType INT = new MiniCobolTokenType("INT");
  IElementType LPAREN = new MiniCobolTokenType("LPAREN");
  IElementType PERFORM = new MiniCobolTokenType("PERFORM");
  IElementType PIC = new MiniCobolTokenType("PIC");
  IElementType PROCEDURE = new MiniCobolTokenType("PROCEDURE");
  IElementType RPAREN = new MiniCobolTokenType("RPAREN");
  IElementType RUN = new MiniCobolTokenType("RUN");
  IElementType SECTION = new MiniCobolTokenType("SECTION");
  IElementType STOP = new MiniCobolTokenType("STOP");
  IElementType STRING = new MiniCobolTokenType("STRING");
  IElementType UNTIL = new MiniCobolTokenType("UNTIL");
  IElementType VALUE = new MiniCobolTokenType("VALUE");
  IElementType VARYING = new MiniCobolTokenType("VARYING");
  IElementType WORKING_STORAGE = new MiniCobolTokenType("WORKING_STORAGE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CONDITION) {
        return new MiniCobolConditionImpl(node);
      }
      else if (type == DATA_DECL) {
        return new MiniCobolDataDeclImpl(node);
      }
      else if (type == DATA_DIVISION) {
        return new MiniCobolDataDivisionImpl(node);
      }
      else if (type == DISPLAY_OPERAND) {
        return new MiniCobolDisplayOperandImpl(node);
      }
      else if (type == DISPLAY_STMT) {
        return new MiniCobolDisplayStmtImpl(node);
      }
      else if (type == IDENTIFICATION_DIVISION) {
        return new MiniCobolIdentificationDivisionImpl(node);
      }
      else if (type == LEVEL_NUMBER) {
        return new MiniCobolLevelNumberImpl(node);
      }
      else if (type == LINE_BODY) {
        return new MiniCobolLineBodyImpl(node);
      }
      else if (type == LINE_NUMBER) {
        return new MiniCobolLineNumberImpl(node);
      }
      else if (type == PARAGRAPH) {
        return new MiniCobolParagraphImpl(node);
      }
      else if (type == PERFORM_STMT) {
        return new MiniCobolPerformStmtImpl(node);
      }
      else if (type == PICTURE) {
        return new MiniCobolPictureImpl(node);
      }
      else if (type == PROCEDURE_DIVISION) {
        return new MiniCobolProcedureDivisionImpl(node);
      }
      else if (type == PROGRAM_ID) {
        return new MiniCobolProgramIdImpl(node);
      }
      else if (type == STATEMENT) {
        return new MiniCobolStatementImpl(node);
      }
      else if (type == STOP_STMT) {
        return new MiniCobolStopStmtImpl(node);
      }
      else if (type == VALUE_CLAUSE) {
        return new MiniCobolValueClauseImpl(node);
      }
      else if (type == WORKING_STORAGE_SECTION) {
        return new MiniCobolWorkingStorageSectionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
