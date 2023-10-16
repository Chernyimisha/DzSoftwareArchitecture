package DZ5.accountingUser;

import DZ5.accountingUser.controller.UserController;
import DZ5.accountingUser.model.FileOperation;
import DZ5.accountingUser.model.FileOperationImpl;
import DZ5.accountingUser.model.Repository;
import DZ5.accountingUser.model.RepositoryFile;
import DZ5.accountingUser.view.*;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);

        Commands com;

        while (true) {
            String command = UserController.prompt("Введите команду: ");
            try {
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                        case CREATE:
                            Command createUserCommand = new CreateCommand(controller);
                            createUserCommand.method();
                            break;
                        case READ:
                            Command readUserCommand = new ReadCommand(controller);
                            readUserCommand.method();
                            break;
                        case LIST:
                            Command readListUserCommand = new ListCommand(controller);
                            readListUserCommand.method();
                            break;
                        case UPDATE:
                            Command UpdateUserCommand = new UpdateCommand(controller);
                            UpdateUserCommand.method();
                            break;
                        case DELETE:
                            Command deleteUserCommand = new DeleteCommand(controller);
                            deleteUserCommand.method();
                            break;
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}