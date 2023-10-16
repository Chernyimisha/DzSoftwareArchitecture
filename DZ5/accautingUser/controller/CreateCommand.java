package DZ5.accautingUser.controller;

public class CreateCommand extends Command{

    @Override
    public void method() throws Exception {
        userController.createUser();
    }
}
