package DZ8.MVI.presenter;


import DZ8.MVI.model.Intent;
import DZ8.MVI.model.TaskCompletedIntent;
import DZ8.MVI.model.Task;
import DZ8.MVI.view.BaseView;
import DZ8.MVI.model.TasksViewState;

import java.util.ArrayList;
import java.util.List;

/**
 * Presenter связывает Model и View, обрабатывая намерения и обновляя состояние представления.
 */
public class TasksPresenter {
    private final List<Task> tasks = new ArrayList<>();
    private final BaseView view;

    public TasksPresenter(BaseView view) {
        this.view = view;
        tasks.add(new Task("Помыть посуду"));
        tasks.add(new Task("Постирать белье"));
    }

    public void dispatch(Intent intent) {
        if (intent instanceof TaskCompletedIntent) {
            int taskId = ((TaskCompletedIntent) intent).getTaskId();
            tasks.get(taskId).complete();
        }
        view.render(new TasksViewState(tasks));
    }

    public void loadTasks() {
        view.render(new TasksViewState(tasks));
    }
}
