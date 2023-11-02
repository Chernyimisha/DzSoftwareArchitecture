package DZ10.products;

/**
 * Компонент: ProductService

 * Описание: Класс ProductService использует Repository для доступа к данным. ProductService имеет метод, содержащий
 * бизнес-логику добавления товаров в список, заключающуюся в проверке минимальной цены на товары с наименованием "Iphone"
 * и "Xiaomi". Цены на такие товары не могут быть меньше 101 и 71 долл. соответственно.
 * Таким образом, ProductService описывает бизнес-логику данных, подаваемых на ProductDAO, абстрагирован от сложностей
 * доступа к данным и предоставляет интерфейс для работы с продуктами.

 */
public class ProductService {

    Repository repository = new Repository();


    public void addServiceProd(Product product){
        if (product.getName().contains("Iphone") && product.getPrice() <= 100){
            System.out.println("Скорректируйте цену для Iphone");

        } else if (product.getName().contains("Xiaomi") && product.getPrice() <= 70){
            System.out.println("Скорректируйте цену для Xiaomi");

        } else repository.addProduct(product);
    }

}
