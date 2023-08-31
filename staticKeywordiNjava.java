public class staticKeywordiNjava {
    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method is created and shared.
        //			The class "owns" the static member

        Friend friend1 = new Friend("SpongeBob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Patrick");
        Friend friend4 = new Friend("Patrick");

        System.out.println(Friend.numberOfFriends + Friend.Band);
    }
}


class Friend {

    String name;

    static int numberOfFriends;


        static String Band;

        static {
            Band = " Band";
        }



    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }
}

