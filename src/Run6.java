public class Run6 {
    public static void main(String[] args) {
//        [, 20)[20,]
        int x = 31;
        if (x < 20) {
            System.out.println("Менше 20");
        } else {
            System.out.println("Больше 20");
        }
        if (x < 20) {
            System.out.println("Менше 20");
        }

        //[, 20)[20, 30)[30, 40)[40, )
        if (x < 20) {
            System.out.println("Менше 20");
        } else {
            if (x < 30) {
                System.out.println("Больше 20, Меньше 30");
            } else {
                if (x < 40) {
                    System.out.println("Больше 30, Меньше 40");
                } else {
                    System.out.println("Больше 40");
                }
            }
        }

        System.out.println("====================");
        if (x < 20) {
            System.out.println("Менше 20");
        } else if (x < 30) {
            System.out.println("Больше 20, Меньше 30");
        } else if (x < 40) {
            System.out.println("Больше 30, Меньше 40");
        } else {
            System.out.println("Больше 40");
        }
    }
}
