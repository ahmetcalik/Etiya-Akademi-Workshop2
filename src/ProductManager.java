import java.util.Random;

public class ProductManager {

    Random random = new Random();

    public void Add(Product product) {
        int randomId = random.nextInt(1000); // id bilgisi db den alınmadığı için random bir id vermesi için yazılmıştır.
        product.setId(randomId);
        System.out.println("Product added: " + product.getId() + " - " + product.getName() + " - " + product.getDescription() + " - " + product.getPrice() + " - " + product.getStockAmount());
    }

    public void Delete(Product product) {
        System.out.println("Product deleted" + " " + product.getId());
    }

    public void Update(Product product) {
        System.out.println("Product updated" + " " + product.getId());
    }
}
