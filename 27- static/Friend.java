public class Friend {

    String name;
    static int numOfFriends;

    Friend(String name){
        this.name = name;
        numOfFriends++;           // You don't need to use (this) with static
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends");
    }

}
