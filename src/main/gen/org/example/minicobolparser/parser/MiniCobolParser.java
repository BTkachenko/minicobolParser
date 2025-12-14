// This is a generated file. Not intended for manual editing.
package org.example.minicobolparser.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.example.minicobolparser.psi.MiniCobolTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MiniCobolParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return miniCobolFile(b, l + 1);
  }

  /* ********************************************************** */
  // IDENTIFIER | INTEGER
  public static boolean arithmeticExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arithmeticExpression")) return false;
    if (!nextTokenIs(b, "<arithmetic expression>", IDENTIFIER, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARITHMETIC_EXPRESSION, "<arithmetic expression>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, INTEGER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER lineBody
  static boolean cobolLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobolLine")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_NUMBER);
    r = r && lineBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NOT? simpleCondition
  public static boolean combinableCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "combinableCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMBINABLE_CONDITION, "<combinable condition>");
    r = combinableCondition_0(b, l + 1);
    r = r && simpleCondition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NOT?
  private static boolean combinableCondition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "combinableCondition_0")) return false;
    consumeToken(b, NOT);
    return true;
  }

  /* ********************************************************** */
  // combinableCondition ((AND | OR) combinableCondition)*
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = combinableCondition(b, l + 1);
    r = r && condition_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((AND | OR) combinableCondition)*
  private static boolean condition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!condition_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "condition_1", c)) break;
    }
    return true;
  }

  // (AND | OR) combinableCondition
  private static boolean condition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = condition_1_0_0(b, l + 1);
    r = r && combinableCondition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AND | OR
  private static boolean condition_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    return r;
  }

  /* ********************************************************** */
  // INTEGER IDENTIFIER pictureClause dataValueClause? DOT
  public static boolean dataDescriptionEntry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDescriptionEntry")) return false;
    if (!nextTokenIs(b, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INTEGER, IDENTIFIER);
    r = r && pictureClause(b, l + 1);
    r = r && dataDescriptionEntry_3(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, DATA_DESCRIPTION_ENTRY, r);
    return r;
  }

  // dataValueClause?
  private static boolean dataDescriptionEntry_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDescriptionEntry_3")) return false;
    dataValueClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DATA DIVISION DOT
  public static boolean dataDivisionHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDivisionHeader")) return false;
    if (!nextTokenIs(b, DATA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATA, DIVISION, DOT);
    exit_section_(b, m, DATA_DIVISION_HEADER, r);
    return r;
  }

  /* ********************************************************** */
  // VALUE literal
  public static boolean dataValueClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataValueClause")) return false;
    if (!nextTokenIs(b, VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUE);
    r = r && literal(b, l + 1);
    exit_section_(b, m, DATA_VALUE_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // WITH? NO ADVANCING
  public static boolean displayAdvancingPhrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayAdvancingPhrase")) return false;
    if (!nextTokenIs(b, "<display advancing phrase>", NO, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISPLAY_ADVANCING_PHRASE, "<display advancing phrase>");
    r = displayAdvancingPhrase_0(b, l + 1);
    r = r && consumeTokens(b, 0, NO, ADVANCING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WITH?
  private static boolean displayAdvancingPhrase_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayAdvancingPhrase_0")) return false;
    consumeToken(b, WITH);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER | literal
  public static boolean displayOperand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayOperand")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISPLAY_OPERAND, "<display operand>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DISPLAY displayOperand+ displayUponPhrase? displayAdvancingPhrase? DOT?
  public static boolean displayStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayStatement")) return false;
    if (!nextTokenIs(b, DISPLAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISPLAY);
    r = r && displayStatement_1(b, l + 1);
    r = r && displayStatement_2(b, l + 1);
    r = r && displayStatement_3(b, l + 1);
    r = r && displayStatement_4(b, l + 1);
    exit_section_(b, m, DISPLAY_STATEMENT, r);
    return r;
  }

  // displayOperand+
  private static boolean displayStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = displayOperand(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!displayOperand(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "displayStatement_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // displayUponPhrase?
  private static boolean displayStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayStatement_2")) return false;
    displayUponPhrase(b, l + 1);
    return true;
  }

  // displayAdvancingPhrase?
  private static boolean displayStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayStatement_3")) return false;
    displayAdvancingPhrase(b, l + 1);
    return true;
  }

  // DOT?
  private static boolean displayStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayStatement_4")) return false;
    consumeToken(b, DOT);
    return true;
  }

  /* ********************************************************** */
  // UPON IDENTIFIER
  public static boolean displayUponPhrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayUponPhrase")) return false;
    if (!nextTokenIs(b, UPON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, UPON, IDENTIFIER);
    exit_section_(b, m, DISPLAY_UPON_PHRASE, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFICATION DIVISION DOT
  public static boolean identificationDivisionHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identificationDivisionHeader")) return false;
    if (!nextTokenIs(b, IDENTIFICATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFICATION, DIVISION, DOT);
    exit_section_(b, m, IDENTIFICATION_DIVISION_HEADER, r);
    return r;
  }

  /* ********************************************************** */
  // identificationDivisionHeader
  //            | programIdHeader
  //            | dataDivisionHeader
  //            | workingStorageSectionHeader
  //            | dataDescriptionEntry
  //            | procedureDivisionHeader
  //            | paragraphHeader
  //            | statementLine
  public static boolean lineBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lineBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LINE_BODY, "<line body>");
    r = identificationDivisionHeader(b, l + 1);
    if (!r) r = programIdHeader(b, l + 1);
    if (!r) r = dataDivisionHeader(b, l + 1);
    if (!r) r = workingStorageSectionHeader(b, l + 1);
    if (!r) r = dataDescriptionEntry(b, l + 1);
    if (!r) r = procedureDivisionHeader(b, l + 1);
    if (!r) r = paragraphHeader(b, l + 1);
    if (!r) r = statementLine(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INTEGER | STRING
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    if (!nextTokenIs(b, "<literal>", INTEGER, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // cobolLine*
  static boolean miniCobolFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "miniCobolFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!cobolLine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "miniCobolFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER DOT
  public static boolean paragraphHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraphHeader")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, DOT);
    exit_section_(b, m, PARAGRAPH_HEADER, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | literal
  public static boolean performBy(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performBy")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PERFORM_BY, "<perform by>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | literal
  public static boolean performFrom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performFrom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PERFORM_FROM, "<perform from>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PERFORM IDENTIFIER performVaryingPhrase DOT?
  public static boolean performStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performStatement")) return false;
    if (!nextTokenIs(b, PERFORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PERFORM, IDENTIFIER);
    r = r && performVaryingPhrase(b, l + 1);
    r = r && performStatement_3(b, l + 1);
    exit_section_(b, m, PERFORM_STATEMENT, r);
    return r;
  }

  // DOT?
  private static boolean performStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performStatement_3")) return false;
    consumeToken(b, DOT);
    return true;
  }

  /* ********************************************************** */
  // WITH? TEST (BEFORE | AFTER)
  public static boolean performTestPhrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performTestPhrase")) return false;
    if (!nextTokenIs(b, "<perform test phrase>", TEST, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PERFORM_TEST_PHRASE, "<perform test phrase>");
    r = performTestPhrase_0(b, l + 1);
    r = r && consumeToken(b, TEST);
    r = r && performTestPhrase_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WITH?
  private static boolean performTestPhrase_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performTestPhrase_0")) return false;
    consumeToken(b, WITH);
    return true;
  }

  // BEFORE | AFTER
  private static boolean performTestPhrase_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performTestPhrase_2")) return false;
    boolean r;
    r = consumeToken(b, BEFORE);
    if (!r) r = consumeToken(b, AFTER);
    return r;
  }

  /* ********************************************************** */
  // performTestPhrase? VARYING IDENTIFIER FROM performFrom BY performBy UNTIL condition
  public static boolean performVaryingPhrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performVaryingPhrase")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PERFORM_VARYING_PHRASE, "<perform varying phrase>");
    r = performVaryingPhrase_0(b, l + 1);
    r = r && consumeTokens(b, 0, VARYING, IDENTIFIER, FROM);
    r = r && performFrom(b, l + 1);
    r = r && consumeToken(b, BY);
    r = r && performBy(b, l + 1);
    r = r && consumeToken(b, UNTIL);
    r = r && condition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // performTestPhrase?
  private static boolean performVaryingPhrase_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performVaryingPhrase_0")) return false;
    performTestPhrase(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // PICCHAR
  public static boolean picChar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "picChar")) return false;
    if (!nextTokenIs(b, PICCHAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PICCHAR);
    exit_section_(b, m, PIC_CHAR, r);
    return r;
  }

  /* ********************************************************** */
  // (PIC | PICTURE) IS? pictureString
  public static boolean pictureClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureClause")) return false;
    if (!nextTokenIs(b, "<picture clause>", PIC, PICTURE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PICTURE_CLAUSE, "<picture clause>");
    r = pictureClause_0(b, l + 1);
    r = r && pictureClause_1(b, l + 1);
    r = r && pictureString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PIC | PICTURE
  private static boolean pictureClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureClause_0")) return false;
    boolean r;
    r = consumeToken(b, PIC);
    if (!r) r = consumeToken(b, PICTURE);
    return r;
  }

  // IS?
  private static boolean pictureClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureClause_1")) return false;
    consumeToken(b, IS);
    return true;
  }

  /* ********************************************************** */
  // picChar+ repeat?
  public static boolean pictureGroup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureGroup")) return false;
    if (!nextTokenIs(b, PICCHAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pictureGroup_0(b, l + 1);
    r = r && pictureGroup_1(b, l + 1);
    exit_section_(b, m, PICTURE_GROUP, r);
    return r;
  }

  // picChar+
  private static boolean pictureGroup_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureGroup_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = picChar(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!picChar(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pictureGroup_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // repeat?
  private static boolean pictureGroup_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureGroup_1")) return false;
    repeat(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // CURRENCY? pictureGroup+ (PUNCTUATION pictureGroup+)*
  public static boolean pictureString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureString")) return false;
    if (!nextTokenIs(b, "<picture string>", CURRENCY, PICCHAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PICTURE_STRING, "<picture string>");
    r = pictureString_0(b, l + 1);
    r = r && pictureString_1(b, l + 1);
    r = r && pictureString_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CURRENCY?
  private static boolean pictureString_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureString_0")) return false;
    consumeToken(b, CURRENCY);
    return true;
  }

  // pictureGroup+
  private static boolean pictureString_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureString_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pictureGroup(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!pictureGroup(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pictureString_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (PUNCTUATION pictureGroup+)*
  private static boolean pictureString_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureString_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!pictureString_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pictureString_2", c)) break;
    }
    return true;
  }

  // PUNCTUATION pictureGroup+
  private static boolean pictureString_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureString_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PUNCTUATION);
    r = r && pictureString_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // pictureGroup+
  private static boolean pictureString_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pictureString_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pictureGroup(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!pictureGroup(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pictureString_2_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PROCEDURE DIVISION DOT
  public static boolean procedureDivisionHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedureDivisionHeader")) return false;
    if (!nextTokenIs(b, PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROCEDURE, DIVISION, DOT);
    exit_section_(b, m, PROCEDURE_DIVISION_HEADER, r);
    return r;
  }

  /* ********************************************************** */
  // PROGRAM_ID DOT IDENTIFIER DOT
  public static boolean programIdHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "programIdHeader")) return false;
    if (!nextTokenIs(b, PROGRAM_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROGRAM_ID, DOT, IDENTIFIER, DOT);
    exit_section_(b, m, PROGRAM_ID_HEADER, r);
    return r;
  }

  /* ********************************************************** */
  // arithmeticExpression relationalOperator arithmeticExpression
  public static boolean relationCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationCondition")) return false;
    if (!nextTokenIs(b, "<relation condition>", IDENTIFIER, INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATION_CONDITION, "<relation condition>");
    r = arithmeticExpression(b, l + 1);
    r = r && relationalOperator(b, l + 1);
    r = r && arithmeticExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IS? (
  //       (NOT? (GREATER THAN? | GT | LESS THAN? | LT | EQUAL TO? | EQ))
  //     | (GREATER THAN? OR EQUAL TO?)
  //     | GE
  //     | (LESS THAN? OR EQUAL TO?)
  //     | LE
  //     | (LT EQ)
  // )
  public static boolean relationalOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATIONAL_OPERATOR, "<relational operator>");
    r = relationalOperator_0(b, l + 1);
    r = r && relationalOperator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IS?
  private static boolean relationalOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_0")) return false;
    consumeToken(b, IS);
    return true;
  }

  // (NOT? (GREATER THAN? | GT | LESS THAN? | LT | EQUAL TO? | EQ))
  //     | (GREATER THAN? OR EQUAL TO?)
  //     | GE
  //     | (LESS THAN? OR EQUAL TO?)
  //     | LE
  //     | (LT EQ)
  private static boolean relationalOperator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relationalOperator_1_0(b, l + 1);
    if (!r) r = relationalOperator_1_1(b, l + 1);
    if (!r) r = consumeToken(b, GE);
    if (!r) r = relationalOperator_1_3(b, l + 1);
    if (!r) r = consumeToken(b, LE);
    if (!r) r = relationalOperator_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT? (GREATER THAN? | GT | LESS THAN? | LT | EQUAL TO? | EQ)
  private static boolean relationalOperator_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relationalOperator_1_0_0(b, l + 1);
    r = r && relationalOperator_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT?
  private static boolean relationalOperator_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_0_0")) return false;
    consumeToken(b, NOT);
    return true;
  }

  // GREATER THAN? | GT | LESS THAN? | LT | EQUAL TO? | EQ
  private static boolean relationalOperator_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relationalOperator_1_0_1_0(b, l + 1);
    if (!r) r = consumeToken(b, GT);
    if (!r) r = relationalOperator_1_0_1_2(b, l + 1);
    if (!r) r = consumeToken(b, LT);
    if (!r) r = relationalOperator_1_0_1_4(b, l + 1);
    if (!r) r = consumeToken(b, EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // GREATER THAN?
  private static boolean relationalOperator_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GREATER);
    r = r && relationalOperator_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THAN?
  private static boolean relationalOperator_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_0_1_0_1")) return false;
    consumeToken(b, THAN);
    return true;
  }

  // LESS THAN?
  private static boolean relationalOperator_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_0_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LESS);
    r = r && relationalOperator_1_0_1_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THAN?
  private static boolean relationalOperator_1_0_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_0_1_2_1")) return false;
    consumeToken(b, THAN);
    return true;
  }

  // EQUAL TO?
  private static boolean relationalOperator_1_0_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_0_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUAL);
    r = r && relationalOperator_1_0_1_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TO?
  private static boolean relationalOperator_1_0_1_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_0_1_4_1")) return false;
    consumeToken(b, TO);
    return true;
  }

  // GREATER THAN? OR EQUAL TO?
  private static boolean relationalOperator_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GREATER);
    r = r && relationalOperator_1_1_1(b, l + 1);
    r = r && consumeTokens(b, 0, OR, EQUAL);
    r = r && relationalOperator_1_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THAN?
  private static boolean relationalOperator_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_1_1")) return false;
    consumeToken(b, THAN);
    return true;
  }

  // TO?
  private static boolean relationalOperator_1_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_1_4")) return false;
    consumeToken(b, TO);
    return true;
  }

  // LESS THAN? OR EQUAL TO?
  private static boolean relationalOperator_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LESS);
    r = r && relationalOperator_1_3_1(b, l + 1);
    r = r && consumeTokens(b, 0, OR, EQUAL);
    r = r && relationalOperator_1_3_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // THAN?
  private static boolean relationalOperator_1_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_3_1")) return false;
    consumeToken(b, THAN);
    return true;
  }

  // TO?
  private static boolean relationalOperator_1_3_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_3_4")) return false;
    consumeToken(b, TO);
    return true;
  }

  // LT EQ
  private static boolean relationalOperator_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalOperator_1_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LT, EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN INTEGER RPAREN
  public static boolean repeat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "repeat")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, INTEGER, RPAREN);
    exit_section_(b, m, REPEAT, r);
    return r;
  }

  /* ********************************************************** */
  // relationCondition | LPAREN condition RPAREN
  public static boolean simpleCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_CONDITION, "<simple condition>");
    r = relationCondition(b, l + 1);
    if (!r) r = simpleCondition_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPAREN condition RPAREN
  private static boolean simpleCondition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleCondition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // performStatement | stopStatement | displayStatement
  public static boolean statementLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statementLine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_LINE, "<statement line>");
    r = performStatement(b, l + 1);
    if (!r) r = stopStatement(b, l + 1);
    if (!r) r = displayStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STOP (RUN | literal) DOT?
  public static boolean stopStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stopStatement")) return false;
    if (!nextTokenIs(b, STOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STOP);
    r = r && stopStatement_1(b, l + 1);
    r = r && stopStatement_2(b, l + 1);
    exit_section_(b, m, STOP_STATEMENT, r);
    return r;
  }

  // RUN | literal
  private static boolean stopStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stopStatement_1")) return false;
    boolean r;
    r = consumeToken(b, RUN);
    if (!r) r = literal(b, l + 1);
    return r;
  }

  // DOT?
  private static boolean stopStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stopStatement_2")) return false;
    consumeToken(b, DOT);
    return true;
  }

  /* ********************************************************** */
  // WORKING_STORAGE SECTION DOT
  public static boolean workingStorageSectionHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workingStorageSectionHeader")) return false;
    if (!nextTokenIs(b, WORKING_STORAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WORKING_STORAGE, SECTION, DOT);
    exit_section_(b, m, WORKING_STORAGE_SECTION_HEADER, r);
    return r;
  }

}
