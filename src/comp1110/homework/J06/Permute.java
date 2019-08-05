package comp1110.homework.J06;


import java.util.Arrays;
import java.util.Scanner;

public class Permute {
    static boolean isPermute(String first, String second){
        int n1 = first.length();
        int n2 = second.length();
        if(n1 != n2){
            return false;
        }
        if(n1 == n2){
            char[] arr1 = first.toCharArray();
            char[] arr2 = second.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for (int i = 0; i < n1; i++)
                if (arr1[i] != arr2[i]){
                    return false;
                }
        }
            return true;
    }
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String x = input.nextLine();
            String y = input.nextLine();
            input.close();
            if(isPermute(x,y)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
}



