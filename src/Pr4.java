import java.util.Scanner;

/**
 * Created by student3 on 19.10.19.
 */
public class Pr4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
  if ((n%100>=11)&&(n%100<=14))
      System.out.println("Рублей");
        else
        switch (n%10)
        {
            case 1:
                System.out.println("Рубль");break;
            case 2:case 3:case 4:
            System.out.println("Рубля");break;
        default:
            System.out.println("Рублей");
        }
    }
}
