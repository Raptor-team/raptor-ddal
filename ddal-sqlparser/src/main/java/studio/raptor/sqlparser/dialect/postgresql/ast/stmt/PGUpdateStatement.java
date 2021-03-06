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
package studio.raptor.sqlparser.dialect.postgresql.ast.stmt;

import studio.raptor.sqlparser.ast.statement.SQLUpdateStatement;
import studio.raptor.sqlparser.dialect.postgresql.ast.PGWithClause;
import studio.raptor.sqlparser.dialect.postgresql.visitor.PGASTVisitor;
import studio.raptor.sqlparser.util.JdbcConstants;
import studio.raptor.sqlparser.visitor.SQLASTVisitor;

public class PGUpdateStatement extends SQLUpdateStatement implements PGSQLStatement {

  private boolean only = false;

  private PGWithClause with;

  public PGUpdateStatement() {
    super(JdbcConstants.POSTGRESQL);
  }

  public boolean isOnly() {
    return only;
  }

  public void setOnly(boolean only) {
    this.only = only;
  }

  public PGWithClause getWith() {
    return with;
  }

  public void setWith(PGWithClause with) {
    this.with = with;
  }

  protected void accept0(SQLASTVisitor visitor) {
    accept0((PGASTVisitor) visitor);
  }

  @Override
  public void accept0(PGASTVisitor visitor) {
    if (visitor.visit(this)) {
      acceptChild(visitor, with);
      acceptChild(visitor, tableSource);
      acceptChild(visitor, items);
      acceptChild(visitor, where);
    }
    visitor.endVisit(this);
  }

}
