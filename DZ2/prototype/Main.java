package DZ_architecture.DZ_2.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        //Создадим первый объект класса "Круг" с помощью конструктора с радиусом равным 5
        Shape circle = new Circle(5);
        //Добавляем в первый объект цвет
        circle.setColor("Red");
        //Продемонстрируем создание аналогичного объекта с помощью клонирования
        Shape clone1 = (Shape) circle.clone();
        //Рисуем второй объект и показываем, что его параметры полностью совпадают с первым объектом
        clone1.draw();
        //Аналогично демонстрируем как работает паттерн с фигурой "Прямоугольник"
        Shape rectangle = new Rectangle(10, 5);
        rectangle.setColor("Blue");
        Shape clone2 = (Shape) rectangle.clone();
        clone2.draw();

    }
}
