package DZ3.accountingUser.view;


import DZ3.accountingUser.controller.Commands;
import DZ3.accountingUser.controller.UserController;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com = Commands.NONE;

        while (true) {
            String command = userController.prompt("Введите команду: ");
            try {
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        userController.createUser();
                        break;
                    case READ:
                        userController.readUser();
                        break;
                    case LIST:
                        userController.readList();
                        break;
                    case UPDATE:
                        userController.updateUser();
                        break;
                    case DELETE:
                        userController.deleteUser();
                        break;
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
