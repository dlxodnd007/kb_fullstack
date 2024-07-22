package org.examle.todo2;

import org.scoula.jdbc_ex.common.JDBCUtil;

import java.sql.Connection;

public class TodoDaoImpl implements TodoDao {
    private final Connection conn;

    public TodoDaoImpl(Connection conn) {
        this.conn = JDBCUtil.getConnection();
    }
}
