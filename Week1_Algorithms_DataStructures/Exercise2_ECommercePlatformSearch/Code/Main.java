import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Apparel"),
            new Product(103, "Book", "Education"),
            new Product(104, "Phone", "Electronics"),
            new Product(105, "Watch", "Accessories")
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String targetName = scanner.next();

        System.out.println("=== Linear Search ===");
        Product result1 = Search.linearSearch(products, targetName);
        System.out.println(result1 != null ? "Found: " + result1 : "Product not found");

        System.out.println("\n=== Binary Search ===");
        Product result2 = Search.binarySearch(products, targetName);
        System.out.println(result2 != null ? "Found: " + result2 : "Product not found");

        scanner.close();
    }
}
