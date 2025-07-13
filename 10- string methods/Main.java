
public class Main {

    public static void main(String[] args){

        String name= "Spongebob" ;

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("b");
        int lastIndex = name.lastIndexOf("b");

        //  name = name.toUpperCase();
        //  name = name.toLowerCase();
        //  name = name.trim();
        //  name = name.replace("b", "p");

        //  name.isEmpty();         =>  false
        //  name.contains(" ");     =>  false
        //  name.equals("ahmed");   =>  false
        //  name.equalsIgnoreCase("spongebob");     =>  true

        System.out.println(name);


    }

}
