import java.util.HashMap;

class Inventory {

    // Stores products using productId as key
    HashMap<Integer, Product> inventory = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {

        if (inventory.containsKey(product.productId)) {
            System.out.println("Product already exists.");
        } else {
            inventory.put(product.productId, product);
            System.out.println("Product Added Successfully.");
        }
    }

    // Update Product
    public void updateProduct(int id, int quantity, double price) {

        if (inventory.containsKey(id)) {

            Product p = inventory.get(id);

            p.quantity = quantity;
            p.price = price;

            System.out.println("Product Updated Successfully.");

        } else {
            System.out.println("Product Not Found.");
        }
    }

    // Delete Product
    public void deleteProduct(int id) {

        if (inventory.containsKey(id)) {

            inventory.remove(id);
            System.out.println("Product Deleted Successfully.");

        } else {
            System.out.println("Product Not Found.");
        }
    }

    // Display All Products
    public void displayProducts() {

        if (inventory.isEmpty()) {
            System.out.println("Inventory is Empty.");
            return;
        }

        for (Product p : inventory.values()) {
            System.out.println("----------------------");
            System.out.println(p);
        }
    }

}