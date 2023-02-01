package javaprojects.week10.mortgage;

public class StateTax {

    /*

            StateTax class was created. Add a private int tax variable to this class.
            Create a constructor which gets String stateName as parameters.
            Assign 20 to tax variable if stateName is New York,
            Assign 15 to tax variable if stateName is New Jersey,
            Assign 5 to tax variable if stateName is Florida,
            Assign 12 to tax variable if stateName is Ohio

            by creating private setTax method and call this method in the constructor.
            Make sure tax variable cannot be changed after it is assigned.
            create a private variable int tax;
            create the constructor
            create a get method of the tax
        */
    private final int tax;

    public StateTax(String stateName) {
        this.tax = setTax(stateName);
    }
    private int setTax(String stateName){
        int persentage = 0;
        if (stateName.equals("New York")){
            persentage = 20;
        }else if (stateName.equals("New Jersey")){
            persentage = 15;
        }else if (stateName.equals("Florida")){
            persentage = 5;
        }else if (stateName.equals("Ohio")){
            persentage = 12;
        }
        return persentage;
    }

    public int getTax() {
        return tax;
    }
}



