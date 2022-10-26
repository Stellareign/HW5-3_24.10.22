public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 5, часть 3, задача 3:");
        int one = -1;
        int two = -5;
        int free = 0;
        boolean maxNumber1 = one >= two && one >= 3; // 1
        boolean maxNumber2 = two >= one && two >= free; // 2
        boolean maxNumber3 = free >= one && free >= two; // 3
             if (maxNumber1) {
            System.out.println("Число " + one + " наибольшее");
        }
        if (maxNumber2) {
            System.out.println("Число " + two + " наибольшее");
        }
        else {
                System.out.println("Число " + free + " наибольшее");
            }

        }
    }
