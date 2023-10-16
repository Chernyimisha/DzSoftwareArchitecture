package DZ5.accautingUser.controller;

public class ListCommand extends Command{
    @Override
    public void method() throws Exception {
        userController.readList();
    }
}
