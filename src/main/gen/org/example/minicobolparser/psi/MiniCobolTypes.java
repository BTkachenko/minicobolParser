// This is a generated file. Not intended for manual editing.
package org.example.minicobolparser.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.example.minicobolparser.psi.impl.*;

public interface MiniCobolTypes {

  IElementType ARITHMETIC_EXPRESSION = new MiniCobolElementType("ARITHMETIC_EXPRESSION");
  IElementType COMBINABLE_CONDITION = new MiniCobolElementType("COMBINABLE_CONDITION");
  IElementType CONDITION = new MiniCobolElementType("CONDITION");
  IElementType DATA_DESCRIPTION_ENTRY = new MiniCobolElementType("DATA_DESCRIPTION_ENTRY");
  IElementType DATA_DIVISION_HEADER = new MiniCobolElementType("DATA_DIVISION_HEADER");
  IElementType DATA_VALUE_CLAUSE = new MiniCobolElementType("DATA_VALUE_CLAUSE");
  IElementType DISPLAY_ADVANCING_PHRASE = new MiniCobolElementType("DISPLAY_ADVANCING_PHRASE");
  IElementType DISPLAY_OPERAND = new MiniCobolElementType("DISPLAY_OPERAND");
  IElementType DISPLAY_STATEMENT = new MiniCobolElementType("DISPLAY_STATEMENT");
  IElementType DISPLAY_UPON_PHRASE = new MiniCobolElementType("DISPLAY_UPON_PHRASE");
  IElementType IDENTIFICATION_DIVISION_HEADER = new MiniCobolElementType("IDENTIFICATION_DIVISION_HEADER");
  IElementType LINE_BODY = new MiniCobolElementType("LINE_BODY");
  IElementType LITERAL = new MiniCobolElementType("LITERAL");
  IElementType PARAGRAPH_HEADER = new MiniCobolElementType("PARAGRAPH_HEADER");
  IElementType PERFORM_BY = new MiniCobolElementType("PERFORM_BY");
  IElementType PERFORM_FROM = new MiniCobolElementType("PERFORM_FROM");
  IElementType PERFORM_STATEMENT = new MiniCobolElementType("PERFORM_STATEMENT");
  IElementType PERFORM_TEST_PHRASE = new MiniCobolElementType("PERFORM_TEST_PHRASE");
  IElementType PERFORM_VARYING_PHRASE = new MiniCobolElementType("PERFORM_VARYING_PHRASE");
  IElementType PICTURE_CLAUSE = new MiniCobolElementType("PICTURE_CLAUSE");
  IElementType PICTURE_GROUP = new MiniCobolElementType("PICTURE_GROUP");
  IElementType PICTURE_STRING = new MiniCobolElementType("PICTURE_STRING");
  IElementType PIC_CHAR = new MiniCobolElementType("PIC_CHAR");
  IElementType PROCEDURE_DIVISION_HEADER = new MiniCobolElementType("PROCEDURE_DIVISION_HEADER");
  IElementType PROGRAM_ID_HEADER = new MiniCobolElementType("PROGRAM_ID_HEADER");
  IElementType RELATIONAL_OPERATOR = new MiniCobolElementType("RELATIONAL_OPERATOR");
  IElementType RELATION_CONDITION = new MiniCobolElementType("RELATION_CONDITION");
  IElementType REPEAT = new MiniCobolElementType("REPEAT");
  IElementType SIMPLE_CONDITION = new MiniCobolElementType("SIMPLE_CONDITION");
  IElementType STATEMENT_LINE = new MiniCobolElementType("STATEMENT_LINE");
  IElementType STOP_STATEMENT = new MiniCobolElementType("STOP_STATEMENT");
  IElementType WORKING_STORAGE_SECTION_HEADER = new MiniCobolElementType("WORKING_STORAGE_SECTION_HEADER");

  IElementType ADVANCING = new MiniCobolTokenType("ADVANCING");
  IElementType AFTER = new MiniCobolTokenType("AFTER");
  IElementType AND = new MiniCobolTokenType("AND");
  IElementType BEFORE = new MiniCobolTokenType("BEFORE");
  IElementType BY = new MiniCobolTokenType("BY");
  IElementType CURRENCY = new MiniCobolTokenType("CURRENCY");
  IElementType DATA = new MiniCobolTokenType("DATA");
  IElementType DISPLAY = new MiniCobolTokenType("DISPLAY");
  IElementType DIVISION = new MiniCobolTokenType("DIVISION");
  IElementType DOT = new MiniCobolTokenType("DOT");
  IElementType EQ = new MiniCobolTokenType("EQ");
  IElementType EQUAL = new MiniCobolTokenType("EQUAL");
  IElementType FROM = new MiniCobolTokenType("FROM");
  IElementType GE = new MiniCobolTokenType("GE");
  IElementType GREATER = new MiniCobolTokenType("GREATER");
  IElementType GT = new MiniCobolTokenType("GT");
  IElementType IDENTIFICATION = new MiniCobolTokenType("IDENTIFICATION");
  IElementType IDENTIFIER = new MiniCobolTokenType("IDENTIFIER");
  IElementType INTEGER = new MiniCobolTokenType("INTEGER");
  IElementType IS = new MiniCobolTokenType("IS");
  IElementType LE = new MiniCobolTokenType("LE");
  IElementType LESS = new MiniCobolTokenType("LESS");
  IElementType LINE_NUMBER = new MiniCobolTokenType("LINE_NUMBER");
  IElementType LPAREN = new MiniCobolTokenType("LPAREN");
  IElementType LT = new MiniCobolTokenType("LT");
  IElementType NO = new MiniCobolTokenType("NO");
  IElementType NOT = new MiniCobolTokenType("NOT");
  IElementType OR = new MiniCobolTokenType("OR");
  IElementType PERFORM = new MiniCobolTokenType("PERFORM");
  IElementType PIC = new MiniCobolTokenType("PIC");
  IElementType PICCHAR = new MiniCobolTokenType("PICCHAR");
  IElementType PICTURE = new MiniCobolTokenType("PICTURE");
  IElementType PROCEDURE = new MiniCobolTokenType("PROCEDURE");
  IElementType PROGRAM_ID = new MiniCobolTokenType("PROGRAM_ID");
  IElementType PUNCTUATION = new MiniCobolTokenType("PUNCTUATION");
  IElementType RPAREN = new MiniCobolTokenType("RPAREN");
  IElementType RUN = new MiniCobolTokenType("RUN");
  IElementType SECTION = new MiniCobolTokenType("SECTION");
  IElementType STOP = new MiniCobolTokenType("STOP");
  IElementType STRING = new MiniCobolTokenType("STRING");
  IElementType TEST = new MiniCobolTokenType("TEST");
  IElementType THAN = new MiniCobolTokenType("THAN");
  IElementType TO = new MiniCobolTokenType("TO");
  IElementType UNTIL = new MiniCobolTokenType("UNTIL");
  IElementType UPON = new MiniCobolTokenType("UPON");
  IElementType VALUE = new MiniCobolTokenType("VALUE");
  IElementType VARYING = new MiniCobolTokenType("VARYING");
  IElementType WITH = new MiniCobolTokenType("WITH");
  IElementType WORKING_STORAGE = new MiniCobolTokenType("WORKING_STORAGE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARITHMETIC_EXPRESSION) {
        return new MiniCobolArithmeticExpressionImpl(node);
      }
      else if (type == COMBINABLE_CONDITION) {
        return new MiniCobolCombinableConditionImpl(node);
      }
      else if (type == CONDITION) {
        return new MiniCobolConditionImpl(node);
      }
      else if (type == DATA_DESCRIPTION_ENTRY) {
        return new MiniCobolDataDescriptionEntryImpl(node);
      }
      else if (type == DATA_DIVISION_HEADER) {
        return new MiniCobolDataDivisionHeaderImpl(node);
      }
      else if (type == DATA_VALUE_CLAUSE) {
        return new MiniCobolDataValueClauseImpl(node);
      }
      else if (type == DISPLAY_ADVANCING_PHRASE) {
        return new MiniCobolDisplayAdvancingPhraseImpl(node);
      }
      else if (type == DISPLAY_OPERAND) {
        return new MiniCobolDisplayOperandImpl(node);
      }
      else if (type == DISPLAY_STATEMENT) {
        return new MiniCobolDisplayStatementImpl(node);
      }
      else if (type == DISPLAY_UPON_PHRASE) {
        return new MiniCobolDisplayUponPhraseImpl(node);
      }
      else if (type == IDENTIFICATION_DIVISION_HEADER) {
        return new MiniCobolIdentificationDivisionHeaderImpl(node);
      }
      else if (type == LINE_BODY) {
        return new MiniCobolLineBodyImpl(node);
      }
      else if (type == LITERAL) {
        return new MiniCobolLiteralImpl(node);
      }
      else if (type == PARAGRAPH_HEADER) {
        return new MiniCobolParagraphHeaderImpl(node);
      }
      else if (type == PERFORM_BY) {
        return new MiniCobolPerformByImpl(node);
      }
      else if (type == PERFORM_FROM) {
        return new MiniCobolPerformFromImpl(node);
      }
      else if (type == PERFORM_STATEMENT) {
        return new MiniCobolPerformStatementImpl(node);
      }
      else if (type == PERFORM_TEST_PHRASE) {
        return new MiniCobolPerformTestPhraseImpl(node);
      }
      else if (type == PERFORM_VARYING_PHRASE) {
        return new MiniCobolPerformVaryingPhraseImpl(node);
      }
      else if (type == PICTURE_CLAUSE) {
        return new MiniCobolPictureClauseImpl(node);
      }
      else if (type == PICTURE_GROUP) {
        return new MiniCobolPictureGroupImpl(node);
      }
      else if (type == PICTURE_STRING) {
        return new MiniCobolPictureStringImpl(node);
      }
      else if (type == PIC_CHAR) {
        return new MiniCobolPicCharImpl(node);
      }
      else if (type == PROCEDURE_DIVISION_HEADER) {
        return new MiniCobolProcedureDivisionHeaderImpl(node);
      }
      else if (type == PROGRAM_ID_HEADER) {
        return new MiniCobolProgramIdHeaderImpl(node);
      }
      else if (type == RELATIONAL_OPERATOR) {
        return new MiniCobolRelationalOperatorImpl(node);
      }
      else if (type == RELATION_CONDITION) {
        return new MiniCobolRelationConditionImpl(node);
      }
      else if (type == REPEAT) {
        return new MiniCobolRepeatImpl(node);
      }
      else if (type == SIMPLE_CONDITION) {
        return new MiniCobolSimpleConditionImpl(node);
      }
      else if (type == STATEMENT_LINE) {
        return new MiniCobolStatementLineImpl(node);
      }
      else if (type == STOP_STATEMENT) {
        return new MiniCobolStopStatementImpl(node);
      }
      else if (type == WORKING_STORAGE_SECTION_HEADER) {
        return new MiniCobolWorkingStorageSectionHeaderImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
