public class switchState {
    public static void main(String[] args) {
        //switch
// if we  do not apply 'break;' then after a statement is true then it all case after that will be consider true
        // STOPSHIP: 8/14/2023
        String day = "Saturday";
        switch (day) {
            case "Sunday":
                System.out.println("it is sunday!");
            break;
            case "Monday":
                System.out.println("it is Monday!");
                break;
            case "Tuesday":
                System.out.println("it is Tuesday!");
                break;
            case "Wednesday":
                System.out.println("it is Wednesday!");
                break;
            case "Thursday":
                System.out.println("it is Thursday!");
                break;
            case "Friday":
                System.out.println("this is Friday!");
                break;
            case  "Saturday":
                System.out.println("this is Saturday");
                break;
            default:
                System.out.println("that is not a day");
        }
    }
}
/*
* Logical AND (&&): This operator returns true if both the left and right operands are true;
* Logical OR (||): This operator returns true if either the left or right operand is true;
* Logical NOT (!): This operator is a unary operator that negates the value of a boolean expression. If the operand is true, ! will make it false, and vice versa.
*
*
*
*
*
*
*
* */