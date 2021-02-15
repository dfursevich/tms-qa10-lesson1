public class Run8 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            System.out.println("Существует");
        } else {
            System.out.println("Не Существует");
        }

        System.out.println("===========");
        if ((a + b <= c) || (b + c <= a) || (c + a <= b)) {
            System.out.println("Не Существует");
        } else {
            System.out.println("Существует");
        }
        System.out.println("===========");

        if (a + b <= c) {
            System.out.println("Не Существует");
        } else if (b + c <= a) {
            System.out.println("Не Существует");
        } else if (c + a <= b) {
            System.out.println("Не Существует");
        } else {
            System.out.println("Существует");
        }
    }
}
