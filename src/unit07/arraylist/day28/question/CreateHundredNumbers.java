package unit07.arraylist.day28.question;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateHundredNumbers {
    public static void main(String[] args) {
        System.out.println(evenNumbers());
        System.out.println(oddNumbers());
        ArrayList<Integer> allNumbers = evenNumbers();
        allNumbers.addAll(oddNumbers());
        System.out.println(allNumbers);
        for (int i = 0; i < allNumbers.size(); i++) {
            if(allNumbers.get(i)%2==0){
                allNumbers.remove(i);
                i--;
            }
        }
        System.out.println(allNumbers);
        /*allNumbers.removeAll(evenNumbers());
        System.out.println(allNumbers);*/

    }

    public static ArrayList<Integer> evenNumbers(){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            if(i%2==0){
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }
    public static ArrayList<Integer> oddNumbers(){
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            if(i%2==1){
                oddNumbers.add(i);
            }
        }
        return oddNumbers;
    }
}
