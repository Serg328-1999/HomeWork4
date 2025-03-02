//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 21;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        } else System.out.println("Нужно подождать !");

        System.out.println("Задание 2");
        byte airTemperature = 8;
        if (airTemperature >= 5) {
            System.out.println("Сегодня тепло , можно пойти без шапки");
        } else System.out.println("На улице холодно, нужно надеть шапку");
        System.out.println("Задание 3");
        byte speed = 86;
        if (speed > 60) {
            System.out.println("Прийдется заплатить штраф !");
        } else System.out.println("Можете ездить спокойно");
        System.out.println("Задание 4");
        byte age1 = 29;
        if (age1 > 2 && age1 < 7) {
            System.out.println("тебе нужно ходить в садик");
        } else if (age1 >= 7 && age1 <=18){
            System.out.println("тебе нужно ходить в школу");
        }
        if (age1 > 18 && age1 <= 24) {
            System.out.println("тебе нужно ходить в университет");
        } else if(age1 > 24) {
            System.out.println("тебе нужно ходить на работу");
        }
        System.out.println("Задание 5");
        byte age2 = 15;
        if (age2 < 5) {
            System.out.println("ребенок не может кататься на атракционах !");
        }
        if (age2 >= 5 && age2 <= 14) {
            System.out.println("ребенок может кататься только в сопровождении взрослых");
        }
        if (age2 > 14) {
            System.out.println("ребенок может кататься самостоятельно");
        }
        System.out.println("Задание 6");
        byte Seats = 102;
        byte availableSeats = 21;
        int place = (Seats - availableSeats) % Seats;
        if (availableSeats >= Seats) {
            System.out.println("К сожалению, свободных мест в этом вагоне  нет");

        } else System.out.println("В этом вагоне есть " + availableSeats + " свободных мест, занято " + place);
        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println( one + "самая маленькая цифра");
        } else if (two >= one && two >= three) {
            System.out.println(two + " больше " + one + "но меньше " + three );
        } else{
            System.out.println(three + "  самая большая цифра");

        }
    }
}




































