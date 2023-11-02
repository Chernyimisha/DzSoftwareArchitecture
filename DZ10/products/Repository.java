package DZ10.products;

public class Repository implements ImpRepository {

    ProductDAO productDAO;

    public Repository(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

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
