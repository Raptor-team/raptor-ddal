/*
 * Copyright 1999-2017 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package studio.raptor.sqlparser.dialect.sqlserver.visitor;

import studio.raptor.sqlparser.dialect.sqlserver.ast.SQLServerOutput;
import studio.raptor.sqlparser.dialect.sqlserver.ast.SQLServerSelect;
import studio.raptor.sqlparser.dialect.sqlserver.ast.SQLServerSelectQueryBlock;
import studio.raptor.sqlparser.dialect.sqlserver.ast.SQLServerTop;
import studio.raptor.sqlparser.dialect.sqlserver.ast.expr.SQLServerObjectReferenceExpr;
import studio.raptor.sqlparser.dialect.sqlserver.ast.stmt.SQLServerCommitStatement;
import studio.raptor.sqlparser.dialect.sqlserver.ast.stmt.SQLServerDeclareStatement;
import studio.raptor.sqlparser.dialect.sqlserver.ast.stmt.SQLServerExecStatement;
import studio.raptor.sqlparser.dialect.sqlserver.ast.stmt.SQLServerExecStatement.SQLServerParameter;
import studio.raptor.sqlparser.dialect.sqlserver.ast.stmt.SQLServerInsertStatement;
import studio.raptor.sqlparser.dialect.sqlserver.ast.stmt.SQLServerRollbackStatement;
import studio.raptor.sqlparser.dialect.sqlserver.ast.stmt.SQLServerSetStatement;
import studio.raptor.sqlparser.dialect.sqlserver.ast.stmt.SQLServerSetTransactionIsolationLevelStatement;
import studio.raptor.sqlparser.dialect.sqlserver.ast.stmt.SQLServerUpdateStatement;
import studio.raptor.sqlparser.dialect.sqlserver.ast.stmt.SQLServerWaitForStatement;
import studio.raptor.sqlparser.visitor.SQLASTVisitorAdapter;

public class SQLServerASTVisitorAdapter extends SQLASTVisitorAdapter implements
    SQLServerASTVisitor {

  @Override
  public boolean visit(SQLServerSelectQueryBlock x) {
    return true;
  }

  @Override
  public void endVisit(SQLServerSelectQueryBlock x) {

  }

  @Override
  public boolean visit(SQLServerTop x) {
    return true;
  }

  @Override
  public void endVisit(SQLServerTop x) {

  }

  @Override
  public boolean visit(SQLServerObjectReferenceExpr x) {
    return true;
  }

  @Override
  public void endVisit(SQLServerObjectReferenceExpr x) {

  }

  @Override
  public boolean visit(SQLServerInsertStatement x) {
    return true;
  }

  @Override
  public void endVisit(SQLServerInsertStatement x) {

  }

  @Override
  public boolean visit(SQLServerUpdateStatement x) {
    return true;
  }

  @Override
  public void endVisit(SQLServerUpdateStatement x) {

  }

  @Override
  public boolean visit(SQLServerExecStatement x) {
    return true;
  }

  @Override
  public void endVisit(SQLServerExecStatement x) {

  }

  @Override
  public boolean visit(SQLServerSetTransactionIsolationLevelStatement x) {
    return true;
  }

  @Override
  public void endVisit(SQLServerSetTransactionIsolationLevelStatement x) {

  }

  @Override
  public boolean visit(SQLServerSetStatement x) {
    return true;
  }

  @Override
  public void endVisit(SQLServerSetStatement x) {

  }

  @Override
  public boolean visit(SQLServerOutput x) {
    return true;
  }

  @Override
  public void endVisit(SQLServerOutput x) {

  }

  @Override
  public boolean visit(SQLServerDeclareStatement x) {
    return true;
  }

  @Override
  public void endVisit(SQLServerDeclareStatement x) {

  }

  @Override
  public boolean visit(SQLServerSelect x) {
    return true;
  }

  @Override
  public void endVisit(SQLServerSelect x) {

  }

  @Override
  public boolean visit(SQLServerCommitStatement x) {
    return true;
  }

  @Override
  public void endVisit(SQLServerCommitStatement x) {

  }

  @Override
  public boolean visit(SQLServerRollbackStatement x) {
    return true;
  }

  @Override
  public void endVisit(SQLServerRollbackStatement x) {

  }

  @Override
  public boolean visit(SQLServerWaitForStatement x) {
    return true;
  }

  @Override
  public void endVisit(SQLServerWaitForStatement x) {

  }

  @Override
  public boolean visit(SQLServerParameter x) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void endVisit(SQLServerParameter x) {
    // TODO Auto-generated method stub

  }

}