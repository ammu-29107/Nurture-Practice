import java.util.Arrays;
import java.util.Comparator;

public class Search {

    public static Product linearSearch(Product[] products, String targetName) {
        int iterations = 0;
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                System.out.println("Linear Search Iterations: " + iterations);
                return product;
            }
            iterations++;
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {
        // Ensure the array is sorted before binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        
        int iterations = 0;
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);

            if (cmp == 0) {
                System.out.println("Binary Search Iterations: " + iterations);
                return products[mid];
            }
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
            iterations++;
        }
        return null;
    }
}
