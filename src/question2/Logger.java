package question2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    //Here, we are eagerly initializing the singleton instance.
    private static final Logger INSTANCE = new Logger();
   private  FileWriter writer;

    // created private constructor to avoid the instantiation of this class from outside.
    private Logger() {
    }

    public static Logger getInstance() {
        return INSTANCE;
    }

    public void log(String message) {

        // creating the file if, it doesn't exist else it will open the file.
        // And it gives exception, file not fount if the particular file doesn't exist.
        try {
            File logFile = new File("log.txt");
            writer = new FileWriter(logFile, true);
            writer.write(message);
            writer.write(System.lineSeparator());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }

    // Closes the file writer when logging is complete
    public void close() {
        try {
            writer.close();
        } catch (IOException e) {
            // Log the error if the file writer could not be closed
            e.printStackTrace();
        }
    }
}

