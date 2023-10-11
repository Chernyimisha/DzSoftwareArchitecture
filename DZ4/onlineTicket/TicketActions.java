package architecture_seminars.onlineTicket;

interface TicketActions {

    //Доступность билетов
    boolean checkTicketAvailability();

    //Бронирование билета
    boolean reserveTicket();


    //Подтверждение покупки
    boolean confirmPurchase();


    void updateTicketAvailability();

    //Отмена бронирования
    boolean cancelReservation();
}