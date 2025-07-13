import java.time.LocalTime;

public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;

    AlarmClock(LocalTime alarmTime){
        this.alarmTime = alarmTime;
    }


    @Override
    public void run(){

        while(LocalTime.now().isBefore(alarmTime)){
            try {

                Thread.sleep(1000);

                System.out.printf("\r%02d:%02d:%02d", LocalTime.now().getHour(),
                                                    LocalTime.now().getMinute(),
                                                    LocalTime.now().getSecond());

            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");;
            }

        }

        System.out.println("\n*ALARM NOISES*");

    }

}
