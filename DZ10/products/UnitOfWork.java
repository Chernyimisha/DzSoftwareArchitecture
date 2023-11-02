package DZ10.products;

import java.util.Scanner;

/**
 * Компонент: UnitOfWork

 * Описание: Класс UnitOfWork используя ProductService реализует метод transaction, обеспечивающий атомарность изменений
 * данных о товарах в продаже и проданных товарах в результате их продажи. Так если факт продажи не подтверждается, то
 * изменения не сохраняются, товар из списка товаров в продажи в список проданных товаров не перемещается.

 */

public class UnitOfWork {

    ProductService productService;
    String saleStatus;

    public UnitOfWork(ProductService productService) {
        this.productService = productService;
    }

    public void transaction(Product product){

        Scanner sc = new Scanner(System.in);
        System.out.printf("Подтвердите продажу %s (yes): ", product.getName());
        String status = sc.nextLine();

        if(status.equalsIgnoreCase("yes")){
            productService.repository.deleteProduct(product);
            productService.repository.addSoldProduct(product);
            System.out.println("Транзакция проведена");
        }
        else System.out.println("Транзакция отклонена.");
    }
}
