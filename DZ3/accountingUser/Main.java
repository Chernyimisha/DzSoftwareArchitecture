package DZ3.accountingUser;

import DZ3.accountingUser.controller.UserController;
import DZ3.accountingUser.model.FileOperation;
import DZ3.accountingUser.model.FileOperationImpl;
import DZ3.accountingUser.model.Repository;
import DZ3.accountingUser.model.RepositoryFile;
import DZ3.accountingUser.view.ViewUser;

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