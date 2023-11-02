package DZ10.products;

/**
 * Компонент: Repository

 * Описание: Класс Repository использовать ProductDAO для доступа к данным. Репозиторий имеет методы для добавления,
 * удаления и получения информации о продуктах. Он также содержит логику, связанную с продуктами. Например,
 * метод добавления addProduct содержит условия для добавления данных о продукте - наименование и цена не должны быть пустым и равным нулю
 * соответственно.
 * Метод удаления deleteProduct содержит проверку удаляемого продукта на предмет наличия его в списке товаров.
 * Методы вывода не печать списка товаров содержат проверку на пустоту списков и в случаях когда список пуст,
 * соответствующий метод ProductDAO не вызывается.
 * Таким образом, Repository анализирует поток, подаваемых на ProductDAO, данных на корректность.

 */

public class Repository implements ImpRepository {

    ProductDAO productDAO = new ProductDAO();


    @Override
    public void addProduct(Product product) {
        if (product.getName().length() != 0 && product.getPrice() != 0)
            productDAO.add(product);
    }

    @Override
    public void addSoldProduct(Product product) {
        productDAO.addSold(product);
    }

    @Override
    public void deleteProduct(Product product) {
        if(productDAO.products.contains(product))
        productDAO.delete(product);
    }

    @Override
    public void getAllProduct() {
        if(!productDAO.products.isEmpty()) {
            System.out.println("Список товаров в продаже");
            productDAO.getAll();
        }
        else System.out.println("Список товаров пуст");
    }

    @Override
    public void getSoldProduct() {
        if(!productDAO.soldProducts.isEmpty()) {
            System.out.println("Список проданных товаров");
            productDAO.getSold();
        }
        else System.out.println("Список проданных товаров пуст");
    }


}
