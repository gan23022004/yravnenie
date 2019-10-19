import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by student3 on 19.10.19.
 */
public class Pr1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();
        if ((x * x + y * y >= 4) && (y <= x) && (x <= 2) && (y > 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }

    }
}