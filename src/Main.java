// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(nighttime(20, 16));
        System.out.println(nighttime(19, -20));
        System.out.println(nighttime(22, 23));
        System.out.println(nighttime(17, 0));
        System.out.println(nighttime(25, 1));
        System.out.println(nighttime(28, 10));
    }

    public static String nighttime(int age, int tempiratura) {
        if (age >= 20 && age <= 45 && tempiratura >= -20 && tempiratura <= 30)
            return "mojno idti gulat";
        else if (age < 20 && tempiratura >= 0 && tempiratura <= 28)
            return "mojno idti gulat";
        else if (age > 45 && tempiratura >= -10 && tempiratura <= 25)
            return "mojno idti gulat";
        else   return "ostavaites doma";
        

    }

}