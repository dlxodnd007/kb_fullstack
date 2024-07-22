package org.examle.todo2;

import java.util.List;

public interface UserDao {
    UserVo loginUser(String userId, String password);
}