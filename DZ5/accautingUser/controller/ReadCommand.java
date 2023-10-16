package DZ5.accautingUser.controller;

public class ReadCommand extends Command{

    @Override
    public void method() throws Exception {
        userController.readUser();
    }
}
