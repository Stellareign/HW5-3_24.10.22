public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 5, часть 3, задача 2:");
        int age = 28;
        boolean ageIsSmallForRides = age < 5;
        if (ageIsSmallForRides) {
            System.out.println("Если возраст равен " + age + ", ребёнку ещё рано кататься на аттаракционах.");
        }
        boolean attractionWithAdultAge = age >= 5 && age <14;
        if (attractionWithAdultAge) {
            System.out.println("Если возраст равен " + age + ", ребёнок может кататься на аттаркционах в сопровождении взрослого.");
        }
        boolean independentAge = age >= 14 && age < 18;
        if (independentAge) {
            System.out.println("Если возраст равен " + age + ", ребёнку можно кататься на атракционах без сопровождения взрослых.");
        }
        boolean adultAge = age >= 18;
        if (adultAge) {
            System.out.println("Если возраст равен " + age + ", то человек уже сам себе хозяин.");
        }
        }
    }
