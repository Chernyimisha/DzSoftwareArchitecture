package DZ6.proxy;

public class FileOperation implements IFileOperation {
    @Override
    public void openFile() {
        System.out.println("the file is open");
    }
}
