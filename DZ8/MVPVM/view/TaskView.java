package DZ8.MVPVM.view;

import DZ8.MVPVM.viewModel.TaskViewModel;

import java.util.List;

public interface TaskView {
    void showTasks(List<TaskViewModel> taskViewModels);
}
