public class Run3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        float d = 25.0f;
        int e = 10;
        int f = 10;
        System.out.println("a + b = " + (a + b)); //10 + 20 = 30
        System.out.println("a - b = " + (a - b)); //10 - 20 = -10
        System.out.println("a * b = " + (a * b)); //10 * 20 = 200
        System.out.println("c / a = " + (c / a)); //25 / 10 = 2
        System.out.println("d / a = " + (d / a)); //25.0 / 10 = 2.5
        System.out.println("b % a = " + (b % a)); //20 % 10 = 0
        System.out.println("c % a = " + (c % a)); //25 % 10 = 5
        System.out.println("a + e++   = " +  (a + e++)); //10 + 10++ = 20
        System.out.println("a + ++f   = " +  (a + ++f)); //10 + ++10 = 21

        float f1 =  c / (float) a;
        System.out.println(f1);

        int a1 = 10;
        int a2 = 10;

//        a1 = a1 + 1; //a1++;
//        a2 = a2 + 1; //++a2;
//        System.out.println(a1);
//        System.out.println(a2);

        int a3 = 10 + a1++;
        System.out.println(a3);
        System.out.println(a1);

        int a4 = 10 + ++a2;
        System.out.println(a4);
        System.out.println(a2);
    }
}
