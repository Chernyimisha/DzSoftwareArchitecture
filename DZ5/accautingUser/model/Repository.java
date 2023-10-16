package DZ5.accautingUser.model;

import java.util.List;

public interface Repository {

    List<User> getAllUsers();

    String addUserToBase(User user);

    User updateUser(User user);

    void deleteUser(User user);

}
