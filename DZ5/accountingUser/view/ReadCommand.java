package DZ5.accountingUser.view;

import DZ5.accountingUser.controller.UserController;

public class ReadCommand extends Command{

    public ReadCommand(UserController userController) {
        super(userController);
    }

    @Override
    public void method() throws Exception {
        userController.readUser();
    }
}
