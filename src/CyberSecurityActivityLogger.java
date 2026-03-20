import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.FileWriter;
import java.io.IOException;

public class CyberSecurityActivityLogger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Format for readable date and time
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.print("Enter username: ");
        String username = input.nextLine();

        LocalDateTime loginTime = LocalDateTime.now();

        System.out.println("\nLogin successful!");
        System.out.println("Login time: " + loginTime.format(format));

        System.out.print("\nEnter your activity: ");
        String activity = input.nextLine();

        LocalDateTime activityTime = LocalDateTime.now();

        System.out.println("\nPress ENTER to logout...");
        input.nextLine();

        LocalDateTime logoutTime = LocalDateTime.now();

        try {

            // Create or append log file
            FileWriter writer = new FileWriter("activity_log.txt", true);

            writer.write("----- USER ACTIVITY LOG -----\n");
            writer.write("User: " + username + "\n");
            writer.write("Login Time: " + loginTime.format(format) + "\n");
            writer.write("Activity: " + activity + "\n");
            writer.write("Activity Time: " + activityTime.format(format) + "\n");
            writer.write("Logout Time: " + logoutTime.format(format) + "\n");
            writer.write("------------------------------\n\n");

            writer.close();

            System.out.println("\nActivity successfully saved to log file.");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        input.close();
    }

}