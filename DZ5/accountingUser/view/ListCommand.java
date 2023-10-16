package DZ5.accountingUser.view;

import DZ5.accountingUser.controller.UserController;

public class ListCommand extends Command{
    public ListCommand(UserController userController) {
        super(userController);
    }

    @Override
    public void method() throws Exception {
        userController.readList();
    }
}
