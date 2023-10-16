package DZ5.accountingUser.view;

import DZ5.accountingUser.controller.UserController;

public class CreateCommand extends Command {

    public CreateCommand(UserController userController) {
        super(userController);
    }

    @Override
    public void method() throws Exception {
        userController.createUser();
    }
}
