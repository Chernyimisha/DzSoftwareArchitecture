package OOP_seminars.accountingUser.controller;

import OOP_seminars.accountingUser.model.NameAndSurnameValidator;
import OOP_seminars.accountingUser.model.Repository;
import OOP_seminars.accountingUser.model.User;

import java.util.List;
import java.util.Scanner;

public class UserController {
    private Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    private User getUser() throws Exception {
        String id = UserController.prompt("Введите id пользователя: ");
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        throw new Exception("User not found");
    }

    public void createUser() throws Exception{
        User user = getNewUser();
        repository.addUserToBase(user);
    }

    public void readUser() throws Exception {
        User user = getUser();
        System.out.println(user);
    }

    public void readList() {
        List<User> userList = repository.getAllUsers();
        for (User u: userList) {
            System.out.println(u);
        }
    }

    public void updateUser() throws Exception {
        readList();
        User user = getUser();
        User updatedUser = getNewUser();
        updatedUser.setId(user.getId());
        User savedUser = repository.updateUser(updatedUser);
        System.out.println(savedUser);
    }

    public void deleteUser() throws Exception {
        readList();
        User user = getUser();
        repository.deleteUser(user);
    }

    private User getNewUser() throws Exception{
        String firstName = prompt("Имя: ");
        new NameAndSurnameValidator(firstName).validate();
        String lastName = prompt("Фамилия: ");
        new NameAndSurnameValidator(lastName).validate();
        String phone = prompt("Номер телефона: ");
        User user = new User(firstName, lastName, phone);
        return user;
    }

    public static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
