package springBoot.service;


import springBoot.models.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    void saveUser(User user);

    User findOneUser(long id);

    void updateUser(long id, User user);

    void deleteUser(long id);
}
