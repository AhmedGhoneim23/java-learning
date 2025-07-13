public class Main {

    public static void main(String[] args) {

        // static = makes a variable or method belong to the class
        //          rather than to any specific object.
        //          commonly used for utility methods or shared resources


        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Sandy");
        Friend friend4 = new Friend("Larry");
        Friend friend5 = new Friend("Nemo");


        System.out.println(Friend.numOfFriends);

        
        Friend.showFriends();



    }

}
