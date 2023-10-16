package DZ5.accautingUser.controller;

public abstract class Command implements CommandsInt{

    UserController userController;

    public Command(UserController userController) {
        this.userController = userController;
    }

}
