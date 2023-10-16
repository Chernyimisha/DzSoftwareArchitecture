package DZ5.accautingUser.controller;

public class UpdateCommand extends Command{
    @Override
    public void method() throws Exception {
        userController.updateUser();
    }
}
