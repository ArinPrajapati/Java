public class varargsInJava {
    public static void main(String[] args) {
        sid sid = new sid();
        System.out.println(sid.add(324,465345,345,36453452,34512345,345,23,45,23,45));
    }

}

class sid {
    public long add(int... i) { // variable length Arguments
        long sum = 0;
        for (long k : i
        ) {
            sum = sum + k;

        }
        return sum;
    }
}
