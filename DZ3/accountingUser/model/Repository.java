package DZ3.accountingUser.model;

import java.util.List;

public interface Repository {

    List<User> getAllUsers();

    String addUserToBase(User user);

    User updateUser(User user);

    void deleteUser(User user);

}
