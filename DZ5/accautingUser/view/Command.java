package DZ5.accautingUser.view;

import DZ5.accautingUser.controller.UserController;

public abstract class Command implements CommandsInt{

    UserController userController;

    public Command(UserController userController) {
        this.userController = userController;
    }

}
