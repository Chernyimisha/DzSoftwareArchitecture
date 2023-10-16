package DZ5.accautingUser.controller;

public class ListCommand extends Command{
    public ListCommand(UserController userController) {
        super(userController);
    }

    @Override
    public void method() throws Exception {
        userController.readList();
    }
}
