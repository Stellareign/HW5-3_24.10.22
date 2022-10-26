public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 5, часть 3, задача 1:");
        int age = 28;
        boolean kindergartenAge = age >= 2 && age <=7;
        if (kindergartenAge) {
            System.out.println("Если возраст равен " + age + ", ребёнок должен ходить в детский сад.");
        }
        boolean schoolAge = age >= 7 && age <=18;
        if (schoolAge) {
            System.out.println("Если возраст равен " + age + ", ребёнок должен ходить в школу.");
        }
        boolean universityAge = age >= 18 && age <=24;
        if (universityAge) {
            System.out.println("Если возраст равен " + age + ", было бы неплохо учиться в университете.");
        }
       else  {
            System.out.println("Если возраст равен " + age + ", пора начинать трудовую деятельность.");
        }
        }
    }
