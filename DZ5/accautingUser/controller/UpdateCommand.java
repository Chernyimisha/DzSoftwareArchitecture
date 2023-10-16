package DZ5.accautingUser.controller;

public class UpdateCommand extends Command{
    public UpdateCommand(UserController userController) {
        super(userController);
    }

    @Override
    public void method() throws Exception {
        userController.updateUser();
    }
}
