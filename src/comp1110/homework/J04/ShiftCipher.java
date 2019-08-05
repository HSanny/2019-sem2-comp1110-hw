package comp1110.homework.J04;

import java.util.Scanner;

public class ShiftCipher {
    int inputNumber;
    String inputString;
    String outputString;

    public ShiftCipher(String inputString, int inputNumber){
        Scanner input = new Scanner(System.in);
        this.inputString = input.nextLine();
        this.inputNumber = input.nextInt();
        input.close();
    }

    public boolean numberWithinRange(int inputNumber){
        if(this.inputNumber > 0 && this.inputNumber < 25){
            return true;

        }
        else{
            return false;
        }
    }

    public String shifting(String inputString, int inputNumber){
        if (numberWithinRange(inputNumber)==true){
                for(int i = 0; i < inputString.length(); i++){
                    char oldChar = inputString.charAt(i);
                    char newChar = oldChar++;
                    inputString.replace(oldChar,newChar);
                }
        }
        this.outputString = inputString;
        return outputString;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        String outputString = "";
        int inputNumber = input.nextInt();
        input.close();
        if(inputNumber >= 0 && inputNumber <= 25){
            for (int i = 0; i < inputString.length(); i++){
                char oldChar = inputString.charAt(i);
                if(Character.isAlphabetic(oldChar)){
                    char newChar = (char)(oldChar + inputNumber);
                    if(Character.isUpperCase(oldChar) && ((int)newChar > 90)){
                        newChar = (char)((int)newChar - 90 + 65 -1);
                        outputString += newChar;
                    }
                    else if(Character.isLowerCase(oldChar) && (int)newChar > 122){
                        newChar = (char)((int)newChar - 122 + 97 -1);
                        outputString += newChar;
                    }
                    else {
                        outputString += newChar;
                    }
                }
                else if((int)oldChar == 9){
                    outputString +="\t";
                }
                else if(Character.isWhitespace(oldChar)){
                    outputString += " ";
                }
                else{
                    outputString += oldChar;
                }
            }
        }
    System.out.println(outputString);
    }

}


