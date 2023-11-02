package DZ10.products;

public class ProductService {

    Repository repository;

    public ProductService(Repository repository) {
        this.repository = repository;
    }

    public void addPhone(Product product){
        if (product.getName().contains("Iphone")){
            if (product.getPrice() <= 100) {
                System.out.println("Скорректируйте цену для Iphone");
            }
        } else if (product.getName().contains("Xiaomi")){
            if (product.getPrice() <= 70) {
                System.out.println("Скорректируйте цену для Xiaomi");
            }
        } else repository.addProduct(product);
    }

}
