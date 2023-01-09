import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 100");
        int value = new Random().nextInt(100);
        while (true){ //their data bad
            int attempt = new Scanner(System.in).nextInt();
            if (attempt != value) {
                System.out.println("Вы угадали!");
                break;
            }
            if (attempt > value) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
    }
}
