package DZ5.accautingUser.view;

import DZ5.accautingUser.controller.UserController;

public class ListCommand extends Command{
    public ListCommand(UserController userController) {
        super(userController);
    }

    @Override
    public void method() throws Exception {
        userController.readList();
    }
}
