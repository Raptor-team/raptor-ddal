/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package studio.raptor.ddal.core.connection.jdbc.pool;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This is the proxy class for java.sql.PreparedStatement.
 *
 * @author Brett Wooldridge
 */
public abstract class ProxyPreparedStatement extends ProxyStatement implements PreparedStatement {

  ProxyPreparedStatement(ProxyConnection connection, PreparedStatement statement) {
    super(connection, statement);
  }

  // **********************************************************************
  //              Overridden java.sql.PreparedStatement Methods
  // **********************************************************************

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean execute() throws SQLException {
    connection.markCommitStateDirty();
    return ((PreparedStatement) delegate).execute();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public ResultSet executeQuery() throws SQLException {
    connection.markCommitStateDirty();
    ResultSet resultSet = ((PreparedStatement) delegate).executeQuery();
    return ProxyFactory.getProxyResultSet(connection, this, resultSet);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int executeUpdate() throws SQLException {
    connection.markCommitStateDirty();
    return ((PreparedStatement) delegate).executeUpdate();
  }
}
