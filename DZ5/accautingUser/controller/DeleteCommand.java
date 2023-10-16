package DZ5.accautingUser.controller;

public class DeleteCommand extends Command{
    @Override
    public void method() throws Exception {
        userController.deleteUser();
    }
}
