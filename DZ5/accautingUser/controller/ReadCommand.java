package DZ5.accautingUser.controller;

public class ReadCommand extends Command{

    public ReadCommand(UserController userController) {
        super(userController);
    }

    @Override
    public void method() throws Exception {
        userController.readUser();
    }
}
