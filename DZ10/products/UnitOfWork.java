package DZ10.products;

public class UnitOfWork {

    Repository repository;
    boolean saleStatus;

    public UnitOfWork(Repository repository) {
        this.repository = repository;
    }

    public void transaction(Product product, Boolean saleStatus){

        if (saleStatus = true){
            repository.deleteProduct(product);
            repository.addSoldProduct(product);
        } else System.out.println("Транзакция отклонена");
    }
}
