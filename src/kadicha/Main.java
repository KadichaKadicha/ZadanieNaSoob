package kadicha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("Здравствуйте!\n" +
                "Как вас зовут?\n"

        );
        String s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя:");

        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Здравствуйте," + name+"!");



    }
}
