package DZ4.onlineTicket;

import java.util.Date;

/**
 * Компонент: UserActions
 * Версия: 1.1.1
 *
 * Описание: Этот компонент определяет контракты для действий пользователя.
 *
 * Изменения:
 * - 1.0.0: Первая версия.
 * - 1.1.0: Добавлена поддержка новой функциональности.
 * - 1.1.1: Добавлены комментарии к методам.
 */
interface UserActions {

    //Проверка наличия билетов
    boolean checkTicketAvailability();

    //Авторизация пользователя
    boolean authorize(String username, String password);

    //Выбор маршрута и времени
    boolean selectRoute(String routeId, Date time);

    //Бронирование билета
    boolean reserveTicket();

    //Наличие средств
    boolean checkFunds();

    //Списание средств
    boolean deductFunds();
}
