package question2;
public class Main {
    public static void main(String[] args) {

        // Here, we are getting an instance of the logger class.
        Logger logger = Logger.getInstance();

        // Using the logger to log all the messages, whatever we want.
        logger.log("Hello, Rishika!");
        logger.log("Welcome to our log file.");


        // Close the logger to free up any resources it was using
        logger.close();
    }
}
