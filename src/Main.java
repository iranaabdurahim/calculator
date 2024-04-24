import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // calculator

        Scanner scan = new Scanner(System.in);
        System.out.println("1.Addition; " + "2.Substraction; " + "3.Multiplication; " + "4.Division; ");
        System.out.print("Yuxaridaki emeliyyatlar uzre seciminizi reqemle edin: ");
        int operator = (scan.nextInt());

        System.out.print("1-ci ededi daxil edin: ");
        int first = scan.nextInt();

       //ashagida sifra bolmeni de vermek istedim, sehv getdi
        System.out.print("2-ci ededi daxil edin: ");
        int second = scan.nextInt();
        if (operator == 4 && second != 0) {
        } else {
            System.out.println("Ededi sifra bolmek olmaz. Yeniden 2-ci ededi daxil edin.");
            second = scan.nextInt();
        }

        switch (operator) {
            case 1 -> System.out.println(addition(first, second));
            case 2 -> System.out.println(substraction(first, second));
            case 3 -> System.out.println(multiplication(first, second));
            case 4 -> System.out.println(division(first, second));
        }

        boolean check = true;
        while (check) {
            System.out.print("Davam etmek isteyirsinizmi? Eger he, 1, eger yox, 2 daxil edin: ");
            int secim = scan.nextInt();
            if (secim == 1) {
                check = true;
            } else {
                check = false;
            }
        }
    }

    public static int addition(int first, int second) {
        return first + second;
    }

    public static int substraction(int first, int second) {
        return first - second;
    }

    public static int multiplication(int first, int second) {
        return first * second;
    }

    public static int division(int first, int second) {
        return first / second;
    }
}

