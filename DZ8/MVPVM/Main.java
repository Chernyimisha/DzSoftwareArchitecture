package DZ8.MVPVM;

import DZ8.MVPVM.presenter.TaskPresenter;
import DZ8.MVPVM.view.ConsoleView;
import DZ8.MVPVM.view.TaskView;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskView view = new ConsoleView();
        TaskPresenter presenter = new TaskPresenter(view);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            presenter.displayTasks();
            System.out.print("Введите номер задачи, чтобы отметить ее как завершенную (или 'exit' для выхода): ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                break;
            }

            try {
                int taskId = Integer.parseInt(input) - 1;
                presenter.completeTask(taskId);
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите номер задачи.");
            }
        }
    }
}
