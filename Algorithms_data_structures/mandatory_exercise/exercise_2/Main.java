public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(103, "Keyboard", "Accessories"),
                new Product(101, "Laptop", "Electronics"),
                new Product(105, "Monitor", "Electronics"),
                new Product(102, "Mouse", "Accessories"),
                new Product(104, "Printer", "Office")

        };

        System.out.println("Linear Search");

        Product result = Search.linearSearch(products, 102);

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Product Not Found");

        Search.sortProducts(products);

        System.out.println("\nBinary Search");

        result = Search.binarySearch(products, 102);

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Product Not Found");
    }
}