package DZ8.mvcExample.controller;

import DZ8.mvcExample.model.PrinterUpperCase;

public class PrinterController {
    PrinterUpperCase printerUpperCase;

    public PrinterController(PrinterUpperCase printerUpperCase) {
        this.printerUpperCase = printerUpperCase;
    }

    public void print(String str) {
        printerUpperCase.print(str);
    }

}
