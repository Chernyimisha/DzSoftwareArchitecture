package DZ8.MVI.view;

import DZ8.MVI.model.ViewState;

/**
 * BaseView - базовый интерфейс для всех видов.
 */
public interface BaseView {
    void render(ViewState state);
}
