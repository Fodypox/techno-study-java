package javaprojects.Nurcan;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your sentence");
        String food= scan.nextLine();
        System.out.println(getInBetween(food));

    }
    public static String getInBetween(String food){
        String search="bread";
        String result="";
        int count=0;
        for (int i = 0; i <=food.length()-search.length(); i++) {
            if (food.substring(i,i+search.length()).equals(search)){
                count++;
            }
        }

        if (!food.contains(search)){
            result+= "nothing";
        } else if (count==1) {
            result+="nothing";
        } else if (food.contains("breadbread")) {
            result+="nothing";
        } else  {
            result+=food.substring(food.indexOf(search)+search.length(), food.lastIndexOf(search));
        }


        return result;
    }
}