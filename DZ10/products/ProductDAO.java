package DZ10.products;

import java.util.ArrayList;
import java.util.List;

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
