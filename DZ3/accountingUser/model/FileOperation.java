package OOP_seminars.accountingUser.model;

import java.util.List;

public interface FileOperation {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}