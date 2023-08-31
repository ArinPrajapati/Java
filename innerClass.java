class Outer{
    int a;
    public  void  show(){

    }

    class Inner {
        public void display(){
            System.out.println("in displays");
        }
    }

}



public class innerClass {
    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1= obj.new Inner();
        obj1.display();
    }
}
