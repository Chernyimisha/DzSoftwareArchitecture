package DZ4.onlineTicket;

/**
 * Компонент: TicketActions
 * Версия: 1.0.0
 *
 * Описание: Этот компонент определяет контракты для операций с билетами.
 *
 * Изменения:
 * - 1.0.0: Первая версия.
 * - 1.1.0: Добавлена поддержка новой функциональности.
 * - 1.1.1: Добавлены комментарии к методам.
 */

interface TicketActions {

    //Подтверждение покупки
    boolean confirmPurchase();

    //Обновление информацию о наличии билетов
    void updateTicketAvailability();

    //Отмена бронирования
    boolean cancelReservation();

}