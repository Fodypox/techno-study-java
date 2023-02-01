package javaprojects.week09;

public class Assignment22 {
    public static void main(String[] args) {
        String shirts[][]=new String[2][2];
        shirts[0][0]="red";
        shirts[0][1]="blue";
        shirts[1][0]="small";
        shirts[1][1]="medium";
        for (String[] out:shirts) {
            for (String in:out) {
                System.out.println(in);
            }
        }
    }
}
