public class Main {

    public static void main(String[] args){

        //  &&  =  AND
        //  ||  =  OR
        //  !  =  NOT

        double temp = -1;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD");
            System.out.println("It is SUNNY outside");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is CLOUDY outside");
        }else if (temp > 30 || temp < 0){
            System.out.println("The weather is bad");
        }


    }

}
