public class MyRunnable implements Runnable{

    private final String text;

    MyRunnable(String text){
        this.text = text;
    }


    @Override
    public void run(){

        for (int i = 1; i <= 5; i++){
            try {
                Thread.sleep(2000);
                System.out.println(this.text);
            }
            catch (InterruptedException e){
                System.out.println("Thread was interrupted");
            }
        }

    }

}
