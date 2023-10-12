package DZ4.onlineTicket;

import java.util.Date;

/**
 * Компонент: Ticket
 * Версия: 1.0.0
 *
 * Описание: Этот компонент описывает абстрактный класс Ticket, имплементирующий интерфейс
 * TicketAction и содержит поля: номер маршрута, время отправления, цена.
 *
 * Изменения:
 * - 1.0.0: Первая версия.
 */
abstract class Ticket implements TicketActions{

    String routeId;
    Date departureTime;
    double price;
}
