package DZ10.products;

public interface ImpRepository {
        void addProduct(Product product);

        void addSoldProduct(Product product);

        void deleteProduct(Product product);

        void getAllProduct();

        void getSoldProduct();

}
