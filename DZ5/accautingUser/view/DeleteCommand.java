package DZ5.accautingUser.view;

import DZ5.accautingUser.controller.UserController;

public class DeleteCommand extends Command{
    public DeleteCommand(UserController userController) {
        super(userController);
    }

    @Override
    public void method() throws Exception {
        userController.deleteUser();
    }
}
