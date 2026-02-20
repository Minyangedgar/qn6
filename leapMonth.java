/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class leapMonth {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        int year;
        boolean isLeapMonth;

        System.out.print("Enter year: ");
        year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapMonth = true;
        } else {
            isLeapMonth = false;
        }

        if (isLeapMonth) {
            System.out.println(year + " is a Leap Month.");
        } else {
            System.out.println(year + " is NOT a Leap Month.");
        }   
    }
    
}
