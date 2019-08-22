import Shapes.*;
import Shapes.Objects2D.circle;
import java.util.Scanner;
import Shapes.Objects3D.*;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println(
                    "What type of shape do you want?" + "\n" + "1)2D Shape" + "\n" + "2)3D Shape" + "\n" + "3)Exit");
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                Shape2D sp2 = new Shape2D("Unamed 2D Shape");
                sp2.selection(sc);
                break;
            case 2:
                Shape3D sp3 = new Shape3D("Unamed 3D Shape");
                sp3.selection();
                break;
            case 3:
                run = false;
                break;

            default:
                System.out.println("Invalid Option, try again");
                break;
            }
        }

    }
}
