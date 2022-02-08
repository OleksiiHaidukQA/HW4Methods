package Methods1;
import java.util.Scanner;
public class InchToMetMethod {

    static double inchmethod() {


        Scanner input = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
        return inch;

    }

    public static void main(String[] args) {
        System.out.println(inchmethod());
    }
}

