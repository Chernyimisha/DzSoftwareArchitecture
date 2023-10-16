package DZ5.accautingUser;

import DZ5.accautingUser.controller.*;
import DZ5.accautingUser.model.FileOperation;
import DZ5.accautingUser.model.FileOperationImpl;
import DZ5.accautingUser.model.Repository;
import DZ5.accautingUser.model.RepositoryFile;
import DZ5.accautingUser.view.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        //ViewUser view = new ViewUser(controller);
        Command createUserCommand = new CreateCommand(controller);
        Command readUserCommand = new ReadCommand(controller);
        Command readListUserCommand = new ListCommand(controller);
        Command UpdateUserCommand = new UpdateCommand(controller);
        Command deleteUserCommand = new DeleteCommand(controller);
        //view.run();

        //void run(){
            Commands com = Commands.NONE;

            while (true) {
                String command = controller.prompt("Введите команду: ");
                try {
                    com = Commands.valueOf(command.toUpperCase());
                    if (com == Commands.EXIT) return;
                    switch (com) {
                        case CREATE:
                            createUserCommand.method();
                            break;
                        case READ:
                            readUserCommand.method();
                            break;
                        case LIST:
                            readListUserCommand.method();
                            break;
                        case UPDATE:
                            UpdateUserCommand.method();
                            break;
                        case DELETE:
                            deleteUserCommand.method();
                            break;
                    }
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        //}
    }
}
//    Сделать удаление из справочника пользователей
//        * Сделать сохранение в другом формате, например, не через запятую, а через точку с запятой,
//        и разделителем - пустой строкой. Предусмотреть сохранение в старом формате.