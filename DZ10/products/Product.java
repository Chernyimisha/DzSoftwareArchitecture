package DZ10.products;

/**
 * Компонент: Product

 * Описание: Класс Product представляет собой продукт с атрибутами id, name и price.
 * Содержит в себе конструктор, toString-метод и основные геттеры и сеттеры.

 */

public class Product {

    private int id;

    private String name;

    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("idProduct: %d, %s - %.2f$", id, name, price);
    }
}
