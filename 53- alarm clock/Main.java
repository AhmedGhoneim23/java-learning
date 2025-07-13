import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        LocalTime alarmtime = null;

        while (alarmtime == null){

            try{

                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();
                alarmtime = LocalTime.parse(inputTime, DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println("Alarm set for " + alarmtime);

            }
            catch (DateTimeParseException e){
                System.out.println("Invalid format. Please use HH:MM:SS");
            }

            Thread thread = new Thread(new AlarmClock(alarmtime));
            thread.start();

        }





        scanner.close();


    }

}
