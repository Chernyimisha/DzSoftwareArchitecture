package DZ10.products;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    List<Product> products = new ArrayList<>();
    private int nextId = 1;


    public void add(Product product){
        product.setId(nextId++);
        products.add(product);
    }

    public void delete(Product product){
        products.remove(product);
    }

    public void getAll(){
        for (Product product : products) {
            System.out.println(product);
        }
    }


}

