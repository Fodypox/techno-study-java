package javaprojects.week09;

public class Assignment11 {
    public static void main(String[] args) {
    String[][] arr = {{"A","B","C"},{"D","E"}};

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j].equals("B")){
                break;
            }
            System.out.print(arr[i][j]);
        }
    }
}
}
