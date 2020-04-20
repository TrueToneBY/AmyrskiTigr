import java.util.Scanner;

public class  Tigr {
    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число голов животных");
        if (sc.hasNextInt()) {
            return sc.nextInt();

        } else {
            System.out.println("Ошибка при вводе повторите ввод");
            getNumber();

        }


        return 0;
    }
}




