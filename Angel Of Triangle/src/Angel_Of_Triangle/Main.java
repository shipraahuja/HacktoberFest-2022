package Angel_Of_Triangle;
// Jan 26, 2022
//All Copyright © goes to Hamim Reza Shammo (https://github.com/hrshammo/)
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, a, b, c, a1, a2, a3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the vlaue of x1:");
        x1 = input.nextDouble();
        System.out.println("Enter the vlaue of y1:");
        y1 = input.nextDouble();
        System.out.println("Enter the vlaue of x2:");
        x2 = input.nextDouble();
        System.out.println("Enter the vlaue of y2:");
        y2 = input.nextDouble();
        System.out.println("Enter the vlaue of x3:");
        x3 = input.nextDouble();
        System.out.println("Enter the vlaue of y3:");
        y3 = input.nextDouble();
        System.out.println("Angle of B:" + a2);
        System.out.println("Angle of C:" + a3);
            System.out.println("Maximum A");
        } else if (a2 > a1 && a2 > a3) {
            System.out.println("Maximum B");
        } else if (a3 > a2 && a3 > a1) {
            System.out.println("Maximum C");
        }
        System.out.println("Minimum ");
        if (a1 < a2 && a1 < a3) {
            System.out.println("A");
        } else if (a2 < a1 && a2 < a3) {
            System.out.println("B");
        } else if (a3 < a2 && a3 < a1) {
            System.out.println("C");
        }
    }
}
