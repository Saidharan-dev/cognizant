import java.util.Arrays;
import java.util.Comparator;

class Search {

    // Linear Search
    public static Product linearSearch(Product[] products, int id) {

        for (Product product : products) {
            if (product.productId == id) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int id) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (products[mid].productId == id) {
                return products[mid];
            }

            if (products[mid].productId < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    // Sort Products by Product ID
    public static void sortProducts(Product[] products) {

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

    }

}