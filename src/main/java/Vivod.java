//
//20.04.2020 Работа методов львы и кенгуру
//

public class Vivod {
    public static void main(String[] args) {
        //int num1 = Tigr.getNumber();
        //int num2 = Kengyry.getNumber2();
        getOperation();


    }

    public static void getOperation(){
        int t ;
        int k ;
        int gol = Tigr.getNumber();
        int nog = Kengyry.getNumber2();

       t = (nog / 2)- gol;
      k = gol - t;

        System.out.println(t + "    " + k);

    }
}
