package DZ5.accautingUser.controller;

import DZ5.accautingUser.view.ViewUser;

public class CreateCommand extends Command {

    public CreateCommand(UserController userController) {
        super(userController);
    }

    @Override
    public void method() throws Exception {
        userController.createUser();
    }
}
