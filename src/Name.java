import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");

        String s1 = scanner.nextLine();

        if (s1.equals("Вячеслав")) {

            System.out.println("Привет," + s1);
        } else

            System.out.println("К сожалению нет такого имени");

    }

}
