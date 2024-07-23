package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public void addUser(UserVo newUser) {
        try {
          // 1. Driver  커넥터 설정
          String driver = "com.mysql.cj.jdbc.Driver";
          Class.forName(driver);
          System.out.println("1. 드라이버 설정 OK");

          // 2. DB연결
          String url = "jdbc:mysql://localhost:3306/user_ex"; // 데이터 베이스 주소
          String id = "root";
          String password = "1234";
          Connection conn = DriverManager.getConnection(url, id, password);
          System.out.println("2. DB 연결 OK");

          // 3. SQL 문 생성
          String sql = "insert into users(email,password) values(?,?)";
          PreparedStatement pstmt = conn.prepareStatement(sql);
          pstmt.setString(1, newUser.getEmail());
          pstmt.setString(2, newUser.getPassword());
          System.out.println("3. SQL 문 생성 OK");

          // 4. SQL문  전송 및 실행
          int affectedRows = pstmt.executeUpdate();
          if (affectedRows > 0) {
              System.out.println("회원 추가 성공!");
          } else {
              System.out.println("회원 추가 실패!");
          }

          // 5.자원 해제
          pstmt.close();
          conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List getAllUsers() {
        List<UserVo> userList = null;
        try {
            userList = new ArrayList<UserVo>();

            // 1. Driver  커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 OK");

            // 2. DB연결
            String url = "jdbc:mysql://localhost:3306/user_ex"; // 데이터 베이스 주소
            String id = "root";
            String password = "1234";
            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            String sql = "select * from users";
            PreparedStatement pstmt = conn.prepareStatement(sql);
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("3. SQL 문 생성 OK");

            // 4. SQL 문 전성
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int userId = rs.getInt("id");
                String userEmail = rs.getString("email");
                String userPassword = rs.getString("password");

                UserVo user = new UserVo(userId, userEmail, userPassword);
                userList.add(user);
            }
            userList.forEach((user) -> System.out.println(user.toString()));
            System.out.println("4.회원 조회 OK");

            //stmt.close();
            rs.close();
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 최종 데이터 리턴
        return userList;
    }

    public void getAllUsers_select(String email) {
        try {
            List<UserVo> users = new ArrayList<UserVo>();

            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 OK");

            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "1234";
            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            String sql = "select * from users where email=?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();
            System.out.println("3. SQL 문 생성 OK");

            while (rs.next()) {
                int user_id = rs.getInt("id");
                String user_email = rs.getString("email");
                String user_password = rs.getString("password");

                UserVo user = new UserVo(user_id, user_email, user_password);
                users.add(user);
            }
            users.forEach((user) -> System.out.println(user.toString()));
            System.out.println("4.특정 회원 조회 OK");

            pstmt.close();
            rs.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(UserVo newUser) {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "1234";
            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            String sql = "delete from users where email = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newUser.getEmail());
            System.out.println("3. SQL 문 생성 OK");

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("유저 삭제 성공!");
            } else {
                System.out.println("유저 삭제 실패!");
            }

            pstmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(int user_id, String user_email, String user_password) {
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "1234";
            Connection conn = DriverManager.getConnection(url,id,password);

            String sql = "update users set password = ? , email = ? where id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user_password);
            pstmt.setString(2, user_email);
            pstmt.setInt(3, user_id);
            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("유저 변경 성공!");
            } else {
                System.out.println("유저 변경 실패!");
            }

            pstmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
