package unit08.twoDarrays.day33.twodarrayinmethods;

public class CountTrue {
    public static void main(String[] args) {
        boolean[][] booleanValues = {
                {true,true,false,true},
                {true,true,false,true},
                {false,true,false,true},
                {false,true,false,false}
        };
        System.out.println("There are "+countBoolean(booleanValues)+" true elements");
        System.out.println(ratio(booleanValues));

    }
    public static int countBoolean(boolean[][] arr){
        int count = 0;
        for (boolean[] out:
             arr) {
            for (boolean in :
                    out) {
                if(in==true){
                    count++;
                }
            }
        }
        return count;
    }
    public static double ratio(boolean[][] arr){
        int countT = 0;
        double countF = 0;


        for (boolean[] out:
                arr) {
            for (boolean in :
                    out) {
                if(in==true){
                    countT++;
                }else {countF++;}
            }
        }
        double ratio = countT/countF;
        return ratio;
    }
}
