package DZ5.accautingUser.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {

    private UserMapper mapper = new UserMapper();

    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }


    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.mapStringToUser(line));
        }
        return users;
    }


    public String addUserToBase(User user) {

        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        List<String> lines = mapper.mapToString(users);
        fileOperation.saveAllLines(lines);
        System.out.printf("User %s successfully added to the database\n", user.toString());
        return id;
    }


    public User updateUser(User user) {
        List<User> users = getAllUsers();
        for (User u: users) {
            if (u.getId().equals(user.getId())){
                u.setName(user.getName());
                u.setSurname(user.getSurname());
                u.setPhone(user.getPhone());
            }
        }
        fileOperation.saveAllLines(mapper.mapToString(users));
        return user;
    }


    public void deleteUser(User user) {
        List<User> users = getAllUsers();
        users.removeIf(u -> u.getId().equals(user.getId()));
        fileOperation.saveAllLines(mapper.mapToString(users));
        System.out.printf("User %s successfully deleted\n", user.toString());
    }


}
