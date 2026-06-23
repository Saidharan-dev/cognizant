public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 10, 55000);
        Product p2 = new Product(102, "Mouse", 50, 700);
        Product p3 = new Product(103, "Keyboard", 30, 1200);

        // Add Products
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        System.out.println("\nCurrent Inventory");
        inventory.displayProducts();

        // Update Product
        System.out.println("\nUpdating Product...");
        inventory.updateProduct(102, 75, 650);

        System.out.println("\nInventory After Update");
        inventory.displayProducts();

        // Delete Product
        System.out.println("\nDeleting Product...");
        inventory.deleteProduct(101);

        System.out.println("\nFinal Inventory");
        inventory.displayProducts();
    }
}