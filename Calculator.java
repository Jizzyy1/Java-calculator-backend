import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Oddiy kalkulyator");
        System.out.print("Birinchi raqamni kiriting : ");
        double num1 = scanner.nextDouble();

        System.out.print("Ikkinchi raqamni kiriting : ");
        double num2 = scanner.nextDouble();

        System.out.println("Operatsiyani tanlang:");
        System.out.println("1. Qo'shish (+)");
        System.out.println("2. Ayirish (-)");
        System.out.println("3. Ko'paytirish (*)");
        System.out.println("4. Bo'lish (/)");

        int tanlov = scanner.nextInt();
        double rezultat = 0;

        switch (tanlov) {
            case 1:
                rezultat = num1 + num2;
                System.out.println("Natija : " + num1 + " + " + num2 + " = " + rezultat);
                break;
            case 2:
                rezultat = num1 - num2;
                System.out.println("Natija : " + num1 + " - " + num2 + " = " + rezultat);
                break;
            case 3:
                rezultat = num1 * num2;
                System.out.println("Natija : " + num1 + " * " + num2 + " = " + rezultat);
                break;
            case 4:
                if (num2 != 0) {
                    rezultat = num1 / num2;
                    System.out.println("Natija: " + num1 + " / " + num2 + " = " + rezultat);
                } else {
                    System.out.println("Xato ");
                }
                break;
            default:
                System.out.println("Mumkin bo'lmagan operatsiya tanlandi.");
                break;
        }

        scanner.close();
    }
}
