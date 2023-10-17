package DZ6.proxy;

import java.util.Scanner;

public class FileOperationProxy implements IFileOperation {

    private FileOperation fileOperation;

    @Override
    public void openFile() {
        //если выполнить условие, то файл откроется
        Scanner in = new Scanner(System.in);
        String password;
        while (true){
            System.out.println("enter the password");
            password = in.nextLine();
            if (password.equals("open")){
                fileOperation = new FileOperation();
                fileOperation.openFile();
                break;
            } else {
                System.out.println("invalid password entered");
            }
        }


    }
}
