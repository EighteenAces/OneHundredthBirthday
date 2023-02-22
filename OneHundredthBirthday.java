import java.util.Scanner;

public class OneHundredthBirthday{

    static int birthDay;
    static int birthYear;
    static int get100Year;

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        OneHundredthBirthday get = new OneHundredthBirthday();
        String birthMonth;
        
        System.out.printf("\nEnter the month you were born: ");
        birthMonth = scan.nextLine();

        System.out.printf("\nEnter the day you were born: ");
        birthDay= scan.nextInt();

        System.out.printf("\nEnter the year you were born: ");
        birthYear = scan.nextInt();
        
        get.getOneHundredthDate();
        System.out.println("\nYou will be 100 on" + " " + birthMonth + " " + birthDay + "," + " " + get100Year);

    }

    public int getOneHundredthDate(){

        get100Year = birthYear + 100;
        return get100Year;
            
    }
}