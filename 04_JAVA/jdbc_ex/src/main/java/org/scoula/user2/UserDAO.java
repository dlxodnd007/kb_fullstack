package org.scoula.user2;

import org.scoula.jdbc_ex.common.JDBCUtil;
import org.scoula.user.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private final Connection conn;

    public UserDAO() {
        this.conn = JDBCUtil.getConnection();
    }

    public void addUser(UserVO newuser) {

        String sql = "INSERT INTO user_table (userid, name, password, age, membership) VALUES (?,?,?,?,?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newuser.getUserid());
            pstmt.setString(2, newuser.getName());
            pstmt.setString(3, newuser.getPassword());
            pstmt.setInt(4, newuser.getAge());
            pstmt.setBoolean(5, newuser.isMembership());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void getAllUsers() {
        String sql = "SELECT * FROM user_table";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ArrayList<UserVO> users = new ArrayList<>();


            while (rs.next()) {
                int id = rs.getInt("id");
                String userid = rs.getString("userid");
                String name = rs.getString("name");
                String password = rs.getString("password");
                int age = rs.getInt("age");
                boolean membership = rs.getBoolean("membership");
                Timestamp signup = rs.getTimestamp("signup_date");
                UserVO user = new UserVO(id, userid, name, password, age, membership, signup);
                users.add(user);
            }

            users.forEach(user -> System.out.println(user));
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
}
