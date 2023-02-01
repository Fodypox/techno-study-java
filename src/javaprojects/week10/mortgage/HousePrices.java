package javaprojects.week10.mortgage;

public class HousePrices extends Users{
    /*
                This class is a subclass of the Users class and it has one private int price variable in addition to the Users class' variables

         */
    private int price;

    public HousePrices(String username, String whichCondition, String houseType, int roomCount, int downPayment, int longTerm, StateTax statetax) {
        super(username, whichCondition, houseType, roomCount, downPayment, longTerm, statetax);
        this.price = price;
    }

    /*
        Create a method, name is roomCountToPrice
        no parameter
        no return type

        if the roomCount in the Users class equal to 0
            add 10000 to price
        if the roomCount in the Users class equal to 1
            add 20000 to price
        if the roomCount in the Users class equal to 2
            add 30000 to price
        if the roomCount in the Users class equal to 3
            add 40000 to price
        if the roomCount in the Users class equal to 4
            add 50000 to price
        if the roomCount in the Users class equal to 5
            add 60000 to price
     */
    public void roomCountToPrice(){
        if (getRoomCount()==0){
            price += 10000;
        }else if (getRoomCount()==1){
            price += 20000;
        }else if (getRoomCount()==2){
            price += 30000;
        }else if (getRoomCount()==3){
            price += 40000;
        }else if (getRoomCount()==4){
            price += 50000;
        }else if (getRoomCount()==5){
            price += 60000;
        }
    }

    /*
        Create a method, name is ConditionToPrice
        no parameter
        no return type

            if WhichCondition variable in the Users class equal to new
                add 50000 to price
            if WhichCondition variable in the Users class equal to like new
                add 40000 to price
            if WhichCondition variable in the Users class equal to old
                add 30000 to price
            if WhichCondition variable in the Users class equal to Renew Required
                add 15000 to price
     */

    public void conditionToPrice(){
        if (getWhichCondition().equals("new")){
            price += 50000;
        }else if (getWhichCondition().equals("like new")){
            price += 40000;
        }else if (getWhichCondition().equals("old")){
            price += 30000;
        }else if (getWhichCondition().equals("Renew Required")){
            price += 15000;
        }
    }

    /*
        Create a method, name is houseTypeToPrice
        no parameter
        no return type
            if HouseType is equal to Apartment
                add 20000 to price
            if HouseType is equal to condo
                add 30000 to price
            if HouseType is equal to house
                add 40000 to price

     */

    public void houseTypeToPrice(){
        if (getHouseType().equals("Apartment")){
            price += 20000;
        }else if (getHouseType().equals("condo")){
            price += 30000;
        }else if (getHouseType().equals("house")){
            price += 40000;
        }
    }

    /*
            Create a method, name is getPriceTotal
            return type is int
            Return the total price(housetype, condition and roomcount prices)
            Also you need to calculate the tax and add  to the price
            For the tax percentage use the StatesTax enum
     */

    public int getPriceTotal(){
        houseTypeToPrice();
        conditionToPrice();
        roomCountToPrice();
        price += price*getStatetax().getTax()/100;

        return price;
    }

    /*
        Create a method, name is getPriceEachMonth

            Return the monthly payment amount.
            reduce the downpayment and calculate the each month's payment
     */

    public int getPriceEachMonth(){
        int monthlyPaymentAmount = 0;
        monthlyPaymentAmount = (price - getDownPayment())/getLongTerm();

        return monthlyPaymentAmount;
    }
}




