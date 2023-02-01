package javaprojects.week10.mortgage;

public class Users {

        /*

            Create private following variables
            String username
            String WhichCondition
            String houseType
            int roomCount
            int downPayment
            int longTerm
            StatesTax statesTax;

            Create a constructor  using all the variables.
            Create the read-only method of the all variables

         */
    private String username;
    private String WhichCondition;
    private String houseType;
    private int roomCount;
    private int downPayment;
    private int longTerm;
    private StateTax statetax;


    public Users(String username, String whichCondition, String houseType, int roomCount, int downPayment, int longTerm, StateTax statetax) {
        this.username = username;
        WhichCondition = whichCondition;
        this.houseType = houseType;
        this.roomCount = roomCount;
        this.downPayment = downPayment;
        this.longTerm = longTerm;
        this.statetax = statetax;
    }

    public String getUsername() {
        return username;
    }

    public String getWhichCondition() {
        return WhichCondition;
    }

    public String getHouseType() {
        return houseType;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public int getLongTerm() {
        return longTerm;
    }

    public StateTax getStatetax() {
        return statetax;
    }
}

