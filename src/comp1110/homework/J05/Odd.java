package comp1110.homework.J05;

import java.util.Scanner;

public class Odd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(isOdd(number)){
            System.out.println(number + " is odd");
        }
        else{
            System.out.println(number + " is even");
        }
    }

    public static boolean isOdd(int number){
        if(number % 2 == 0){
            return false;
        }
        else return true;
    }
}


