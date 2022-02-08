package Methods1;
import java.util.Scanner;
public class RandomInt {

    static int randomint() {


        Scanner sc = new Scanner(System.in);
        System.out.print("Input the starting number of the range: ");
        int rsnum = sc.nextInt();
        System.out.print("Input the ending number of the range: ");
        int renum = sc.nextInt();
        int random_num = rsnum + (int) (Math.random() * ((renum - rsnum) + 1));
        System.out.println(random_num);

        return sc.nextInt();
    }

    public static void main(String args[]) {
        System.out.println(randomint());
    }
}