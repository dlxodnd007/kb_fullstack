package org.example;

import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        // 회원 추가, 이제는 객체를 전달
        UserVo newUser = new UserVo(0, "tetz2", "1234");
//        userDao.addUser(newUser);

        List<UserVo> users = userDao.getAllUsers();

        for (UserVo user : users) {
            // System.out.println(user);
            System.out.print("아이디는 : " + user.getId() + " / ");
            System.out.print("이메일은 : " + user.getEmail() + " / ");
            System.out.print("비번은 : " + user.getPassword() + " / " + "\n");
        }

        userDao.getAllUsers_select("tetz");
//        userDao.delete(newUser);
        //userDao.addUser(newUser);
        userDao.update(5,"tetz22","12341234");
        userDao.getAllUsers();

    }
}
