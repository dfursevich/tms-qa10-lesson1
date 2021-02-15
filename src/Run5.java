public class Run5 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b)); //false
        System.out.println("a || b = " + (a || b)); //true
        System.out.println("!a = " + !a); //false

        int age = 70;

        boolean ok = (age > 20) && (age < 60);
        System.out.println(ok);
    }

}
