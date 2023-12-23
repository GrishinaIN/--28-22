public class main1 {
    public static void main(String[] args) {
        Priceable product = new Product("Phone", 500.0);
        Priceable service = new Service("Plumbing", 50.0, 2);

        System.out.println("Product price: " + product.getPrice());
        System.out.println("Service price: " + service.getPrice());
    }
}