
public class Main {

    public static void main(String[] args){

        // .substring() = A method used to extract a portion of a string
        //                .substring(start, end)


        String email = "Bro123@gmail.com";
        String username = email.substring(0, 6);
        String domain = email.substring(7);


        email = "ahmed123@gmail.com";
        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);


        System.out.println(username);
        System.out.println(domain);

    }

}
