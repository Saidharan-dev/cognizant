class Product {

    int productId;
    String productName;
    int quantity;
    double price;

    // Constructor
    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Display product details
    @Override
    public String toString() {
        return "Product ID : " + productId +
                "\nProduct Name : " + productName +
                "\nQuantity : " + quantity +
                "\nPrice : " + price;
    }
}   