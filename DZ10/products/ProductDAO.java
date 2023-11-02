package DZ10.products;

import java.util.ArrayList;
import java.util.List;

/**
 * Компонент: ProductDAO

 * Описание: Класс ProductDAO содержит в качестве атрибутов структуры данных для хранения информации о продуктах в продаже -
 * List<Product> products и List<Product> soldProducts - о проданных продуктах. А также методы для добавления, удаления
 * и получения данных о продуктах из базы данных.
 * Используется строго для взаимодействия с данными о продуктах без предварительного анализа потока данных. Методы данного
 * класса вызываются классом Repository.

 */

public class ProductDAO {

    List<Product> products = new ArrayList<>();
    List<Product> soldProducts = new ArrayList<>();
    private int nextId = 1;



    public void add(Product product){
        product.setId(nextId++);
        products.add(product);
    }
    public void addSold(Product product){
        soldProducts.add(product);
    }


    public void delete(Product product){
        products.remove(product);
    }

    public void getAll(){
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void getSold(){
        for (Product product : soldProducts) {
            System.out.println(product);
        }
    }
}

