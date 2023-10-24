import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  example1();
        example2();
    }

    private static void example2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 2 числа");
        int x = scanner.nextInt();
        int y= scanner.nextInt();
        int z = 0;
        try {
            z = B.mult(x, y);
            System.out.println("z = "+z);
        } catch (UnluckyNumException e) {
            System.out.println("сработало исключение "+e.toString()+" с сообщением "+e.getMessage());
            System.out.println("кстати, там внутри число "+e.num);
        }
    }

    private static void example1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 2 числа");
        int x = scanner.nextInt();
        int y= scanner.nextInt();
        try {
            A.printNum(x);
            A.printNum(y);
            A.printNum(x + y);
        }
        catch (Exception ex)  {
            System.out.println("внутри класса A что-то пошло не так "+ex.getMessage());
        }
        System.out.println("всем спасибо");
    }
}