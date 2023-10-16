package DZ5.accountingUser.view;

import DZ5.accountingUser.controller.UserController;

public class DeleteCommand extends Command{
    public DeleteCommand(UserController userController) {
        super(userController);
    }

    @Override
    public void method() throws Exception {
        userController.deleteUser();
    }
}
