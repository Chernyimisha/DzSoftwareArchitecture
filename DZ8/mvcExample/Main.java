package DZ8.mvcExample;

import DZ8.mvcExample.controller.PrinterController;
import DZ8.mvcExample.model.PrinterUpperCase;
import DZ8.mvcExample.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        PrinterUpperCase printerUpperCaseMODEL = new PrinterUpperCase();
        PrinterController printerControllerCONTROLLER = new PrinterController(printerUpperCaseMODEL);
        ConsoleView view = new ConsoleView(printerControllerCONTROLLER);
        view.run();
    }
}
