package DZ10.products;

/**
 * Компонент: ImpRepository

 * Описание: интерфейс, который предусматривает методы обработки данных, хранящихся в ProductDAO.
 */

public interface ImpRepository {

        // метод добавления данных о продукте в список товаров
        void addProduct(Product product);
        // метод добавления данных о продукте в список проданных товаров
        void addSoldProduct(Product product);
        // метод удаления данных о продукте из списка товаров
        void deleteProduct(Product product);
        // метод вывода данных о всех продуктах в списке товаров
        void getAllProduct();
        // метод вывода данных о всех продуктах в списке проданных товаров
        void getSoldProduct();

}
