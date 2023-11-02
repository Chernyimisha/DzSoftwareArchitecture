package DZ10.products;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Iphone10", 80);
        Product product2 = new Product("Iphone12", 900);
        Product product3 = new Product("Iphone14", 1000);

        ProductDAO productDAO = new ProductDAO();
        Repository repository = new Repository(productDAO);
        ProductService productService = new ProductService(repository);

        productService.addPhone(product1);
        repository.addProduct(product2);
        repository.addProduct(product3);
        repository.getAllProduct();

        System.out.println();

        repository.deleteProduct(product3);
        repository.getAllProduct();

        System.out.println();

        Product product4 = new Product("Iphone15", 1500);
        repository.addProduct(product4);
        repository.getAllProduct();

    }
}
