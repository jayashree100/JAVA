import java.lang.Math;
import java.util.Scanner;
class LengthCalculation
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of first co-ordinates x1 and y1");
        int x1=sc.nextInt();
        int y1= sc.nextInt();
        System.out.println("Enter the value of second co-ordinates x2 and y2");
        int x2=sc.nextInt();
        int y2= sc.nextInt();
        double length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        System.out.println("the length is"+length);
}
 }
