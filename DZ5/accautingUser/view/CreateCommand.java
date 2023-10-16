package DZ5.accautingUser.view;


import DZ5.accautingUser.controller.UserController;

public class CreateCommand extends Command {

    public CreateCommand(UserController userController) {
        super(userController);
    }

    @Override
    public void method() throws Exception {
        userController.createUser();
    }
}
