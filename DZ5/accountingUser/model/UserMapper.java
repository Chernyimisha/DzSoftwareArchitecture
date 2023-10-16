package DZ5.accountingUser.model;

import java.util.ArrayList;
import java.util.List;

public class UserMapper {


    public String mapUserToString(User user) {
        return String.format("%s,%s,%s,%s", user.getId(), user.getName(), user.getSurname(), user.getPhone());
    }

    public User mapStringToUser(String line) {
        String[] lines = line.split(",");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }

    public List<String> mapToString(List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User item: users) {
            lines.add(mapUserToString(item));
        }
        return lines;
    }
}
