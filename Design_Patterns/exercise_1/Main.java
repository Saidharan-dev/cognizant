public class Main {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Application Started");

        Logger logger2 = Logger.getInstance();
        logger2.log("User Logged In");

        Logger logger3 = Logger.getInstance();
        logger3.log("Application Closed");

        // Verify both references point to the same object
        System.out.println("\nChecking Singleton Instance");

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("Only One Logger Instance Exists.");
        } else {
            System.out.println("Multiple Logger Instances Exist.");
        }
    }
}