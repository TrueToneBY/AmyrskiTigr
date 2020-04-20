import javax.swing.*;
import java.util.Scanner;

public  class Kengyry {
    public static int getNumber2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество ног");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Ошибка ! Введите количество ног например 100");
            getNumber2();
        }
        return 0;


    }
}

