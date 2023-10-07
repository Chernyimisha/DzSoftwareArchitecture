package OOP_seminars.accountingUser;

import OOP_seminars.accountingUser.controller.UserController;
import OOP_seminars.accountingUser.model.FileOperation;
import OOP_seminars.accountingUser.model.FileOperationImpl;
import OOP_seminars.accountingUser.model.Repository;
import OOP_seminars.accountingUser.model.RepositoryFile;
import OOP_seminars.accountingUser.view.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
//    Сделать удаление из справочника пользователей
//        * Сделать сохранение в другом формате, например, не через запятую, а через точку с запятой,
//        и разделителем - пустой строкой. Предусмотреть сохранение в старом формате.