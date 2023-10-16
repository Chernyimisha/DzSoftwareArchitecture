package DZ5.accountingUser.view;

import DZ5.accountingUser.controller.UserController;

public abstract class Command implements CommandsInt{

    UserController userController;

    public Command(UserController userController) {
        this.userController = userController;
    }

}
