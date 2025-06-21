public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Starting application...");

        Logger logger2 = Logger.getInstance();
        logger2.log("Application is running.");

        // Verifying if both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Confirmed: Only one Logger instance exists.");
        } else {
            System.out.println("Error: Multiple Logger instances exist!");
        }
    }
}