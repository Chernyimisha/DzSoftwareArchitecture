package DZ10.products;

public class Main {
    public static void main(String[] args) {


        //создаем экземпляры класса Product
        Product product1 = new Product("Iphone10", 800);
        Product product2 = new Product("Xiaomi Redmi Note", 500);
        Product product3 = new Product("Iphone14", 1000);

        //создаем экземпляр класса productService, для доступа к операциям с данными
        ProductService productService = new ProductService();

        //добавляем продукты в список товаров на продажу с помощью метода класса ProductService и проверяем список
        productService.addServiceProd(product1);
        productService.addServiceProd(product2);
        productService.addServiceProd(product3);
        productService.repository.getAllProduct();

        System.out.println();

        //удаляем
        productService.repository.deleteProduct(product3);

        //добавляем и снова проверяем
        Product product4 = new Product("Iphone15", 1500);
        productService.repository.addProduct(product4);
        productService.repository.getAllProduct();

        //создаем экземпляр UnitOfWork для транзакций
        UnitOfWork unitOfWork = new UnitOfWork(productService);

        //Продаем "Iphone15" за 1500 долл. и смотрим результат. Если продажа пользователем будет подтверждена,
        //то "Iphone15" перейдет из списка товаров на продажу в список проданных товаров.
        unitOfWork.transaction(product4);
        productService.repository.getAllProduct();
        productService.repository.getSoldProduct();

    }
}
