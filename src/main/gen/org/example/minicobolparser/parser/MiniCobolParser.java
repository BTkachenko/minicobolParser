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
  // lineNumber lineBody
  static boolean cobolLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobolLine")) return false;
    if (!nextTokenIs(b, INT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lineNumber(b, l + 1);
    r = r && lineBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER EQ INT
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, EQ, INT);
    exit_section_(b, m, CONDITION, r);
    return r;
  }

  /* ********************************************************** */
  // levelNumber IDENTIFIER PIC picture valueClause? DOT
  public static boolean dataDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDecl")) return false;
    if (!nextTokenIs(b, INT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = levelNumber(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, PIC);
    r = r && picture(b, l + 1);
    r = r && dataDecl_4(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, DATA_DECL, r);
    return r;
  }

  // valueClause?
  private static boolean dataDecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDecl_4")) return false;
    valueClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DATA DIVISION DOT
  public static boolean dataDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataDivision")) return false;
    if (!nextTokenIs(b, DATA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DATA, DIVISION, DOT);
    exit_section_(b, m, DATA_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // STRING | IDENTIFIER | INT
  public static boolean displayOperand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayOperand")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISPLAY_OPERAND, "<display operand>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, INT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DISPLAY displayOperand+ DOT
  public static boolean displayStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayStmt")) return false;
    if (!nextTokenIs(b, DISPLAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISPLAY);
    r = r && displayStmt_1(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, DISPLAY_STMT, r);
    return r;
  }

  // displayOperand+
  private static boolean displayStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "displayStmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = displayOperand(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!displayOperand(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "displayStmt_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFICATION DIVISION DOT
  public static boolean identificationDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identificationDivision")) return false;
    if (!nextTokenIs(b, IDENTIFICATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFICATION, DIVISION, DOT);
    exit_section_(b, m, IDENTIFICATION_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // INT
  public static boolean levelNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "levelNumber")) return false;
    if (!nextTokenIs(b, INT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT);
    exit_section_(b, m, LEVEL_NUMBER, r);
    return r;
  }

  /* ********************************************************** */
  // identificationDivision
  //            | programId
  //            | dataDivision
  //            | workingStorageSection
  //            | dataDecl
  //            | procedureDivision
  //            | paragraph
  //            | statement
  public static boolean lineBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lineBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LINE_BODY, "<line body>");
    r = identificationDivision(b, l + 1);
    if (!r) r = programId(b, l + 1);
    if (!r) r = dataDivision(b, l + 1);
    if (!r) r = workingStorageSection(b, l + 1);
    if (!r) r = dataDecl(b, l + 1);
    if (!r) r = procedureDivision(b, l + 1);
    if (!r) r = paragraph(b, l + 1);
    if (!r) r = statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INT
  public static boolean lineNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lineNumber")) return false;
    if (!nextTokenIs(b, INT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT);
    exit_section_(b, m, LINE_NUMBER, r);
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
  public static boolean paragraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, DOT);
    exit_section_(b, m, PARAGRAPH, r);
    return r;
  }

  /* ********************************************************** */
  // PERFORM IDENTIFIER VARYING IDENTIFIER FROM INT BY INT UNTIL condition DOT?
  public static boolean performStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performStmt")) return false;
    if (!nextTokenIs(b, PERFORM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PERFORM, IDENTIFIER, VARYING, IDENTIFIER, FROM, INT, BY, INT, UNTIL);
    r = r && condition(b, l + 1);
    r = r && performStmt_10(b, l + 1);
    exit_section_(b, m, PERFORM_STMT, r);
    return r;
  }

  // DOT?
  private static boolean performStmt_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "performStmt_10")) return false;
    consumeToken(b, DOT);
    return true;
  }

  /* ********************************************************** */
  // DIGIT9 LPAREN INT RPAREN
  public static boolean picture(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "picture")) return false;
    if (!nextTokenIs(b, DIGIT9)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DIGIT9, LPAREN, INT, RPAREN);
    exit_section_(b, m, PICTURE, r);
    return r;
  }

  /* ********************************************************** */
  // PROCEDURE DIVISION DOT
  public static boolean procedureDivision(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedureDivision")) return false;
    if (!nextTokenIs(b, PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROCEDURE, DIVISION, DOT);
    exit_section_(b, m, PROCEDURE_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // 'PROGRAM-ID' DOT IDENTIFIER DOT
  public static boolean programId(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "programId")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROGRAM_ID, "<program id>");
    r = consumeToken(b, "PROGRAM-ID");
    r = r && consumeTokens(b, 0, DOT, IDENTIFIER, DOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // performStmt
  //             | stopStmt
  //             | displayStmt
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = performStmt(b, l + 1);
    if (!r) r = stopStmt(b, l + 1);
    if (!r) r = displayStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STOP RUN DOT
  public static boolean stopStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stopStmt")) return false;
    if (!nextTokenIs(b, STOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STOP, RUN, DOT);
    exit_section_(b, m, STOP_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // VALUE (INT | STRING)
  public static boolean valueClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueClause")) return false;
    if (!nextTokenIs(b, VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUE);
    r = r && valueClause_1(b, l + 1);
    exit_section_(b, m, VALUE_CLAUSE, r);
    return r;
  }

  // INT | STRING
  private static boolean valueClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueClause_1")) return false;
    boolean r;
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, STRING);
    return r;
  }

  /* ********************************************************** */
  // WORKING_STORAGE SECTION DOT
  public static boolean workingStorageSection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workingStorageSection")) return false;
    if (!nextTokenIs(b, WORKING_STORAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WORKING_STORAGE, SECTION, DOT);
    exit_section_(b, m, WORKING_STORAGE_SECTION, r);
    return r;
  }

}
