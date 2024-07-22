package org.examle.todo2;

import org.scoula.jdbc_ex.common.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class UserDaoImpl implements UserDao {
    private final Connection conn;

    public UserDaoImpl(Connection conn) {
        this.conn = JDBCUtil.getConnection();
    }

    @Override
    public UserVo loginUser(String user_id, String password) {
        String sql = "select * from todo_user where user_id=? and password=?";
        UserVo loginUser = null;

        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user_id);
            pstmt.setString(2, password);

            try(ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    String loginUserId = rs.getString("user_id");
                    String loginName = rs.getString("name");
                    String loginPassword = rs.getString("password");
                    Timestamp loginCreatedAt = rs.getTimestamp("created_at");

                    loginUser = new UserVo(loginUserId, loginName, loginPassword, loginCreatedAt);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return loginUser;
    }
}
