package comp1110.homework.J05;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String movieName = input.nextLine();
        int movieTime = input.nextInt();
        input.close();
        if(movieTime >= 120){
            int hour = movieTime / 60;
            int minute = movieTime % 60;
            if(minute > 1){
                System.out.println(movieName + " runs for " + hour + " hours and " + minute + " minutes");
            }
            else if(minute == 0){
                System.out.println(movieName + " runs for " + hour + " hours");
            }
            else if(minute == 1){
                System.out.println(movieName + " runs for " + hour + " hours and " + minute + " minute");
            }
        }
        else if(movieTime < 120 && movieTime >= 60){
            int hour = movieTime / 60;
            int minute = movieTime % 60;
            if(minute > 1){
                System.out.println(movieName + " runs for " + hour + " hour and " + minute + " minutes");
            }
            if(minute == 0){
                System.out.println(movieName + " runs for " + hour + " hour");
            }
            else if (minute == 1){
                System.out.println(movieName + " runs for " + hour + " hour and " + minute + " minute");
            }
        }
        else if(movieTime < 60){
            if(movieTime > 1){
                System.out.println(movieName + " runs for " + movieTime + " minutes");
            }
            else if(movieTime == 1){
                System.out.println(movieName + " runs for 1 minute");
            }

        }
    }
}
