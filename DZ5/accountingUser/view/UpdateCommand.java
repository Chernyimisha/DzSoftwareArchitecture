package DZ5.accountingUser.view;

import DZ5.accountingUser.controller.UserController;

public class UpdateCommand extends Command{
    public UpdateCommand(UserController userController) {
        super(userController);
    }

    @Override
    public void method() throws Exception {
        userController.updateUser();
    }
}
