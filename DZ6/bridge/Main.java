package DZ6.bridge;

public class Main {
    public static void main(String[] args) {
        //Поле Color color и является мостом (bridge), который связывает классы Shape и Color.
        //При этом мы спокойно можем модифицировать сущности не затрагивая друг друга.

        Shape rectangle = new Rectangle(new BlackColor());
        Shape triangle = new Triangle(new GreenColor());
        Shape triangle1 = new Triangle(new RedColor());

        rectangle.draw();
        rectangle.color.fillColor();
        triangle.draw();
        triangle.color.fillColor();
        triangle.draw();
        triangle1.color.fillColor();
    }
}
