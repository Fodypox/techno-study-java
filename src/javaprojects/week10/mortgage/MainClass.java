package javaprojects.week10.mortgage;

public class MainClass {
    public static void main(String[] args) {

        /*Create 4 instances of HousePrices
        housePrices1 -> userName = David, whichCondition = Like New, houseType = House, roomCount = 5, downPayment = 50000, longTerm = 30, StateName = New York
        and check if PriceTotal is 168000, PriceEachMonth is 3933, userName is David

        housePrices2 -> userName = Fernando, whichCondition = new, houseType = Apartment, roomCount = 3, downPayment = 40000, longTerm = 30, StateName = Ohio
        and check if PriceTotal is 123200, PriceEachMonth is 2773, userName is Fernando

        housePrices3 -> userName = Emily, whichCondition = Old, houseType = condo, roomCount = 4, downPayment = 30000, longTerm = 36, StateName = Florida
        and check if PriceTotal is 115500, PriceEachMonth is 2375, userName is Emily

        housePrices4 -> userName = Rinda, whichCondition = Renew Required, houseType = condo, roomCount = 1, downPayment = 50000, longTerm = 35, StateName = New Jersey
        and check if PriceTotal is 74750, PriceEachMonth is 707, userName is Rinda
        * */
        HousePrices housePrices1 =
                new HousePrices("David","like new","house",5,50000,30,new StateTax("New York"));
        System.out.println(housePrices1.getPriceTotal());
        System.out.println(housePrices1.getPriceEachMonth());
        System.out.println(housePrices1.getUsername());
        HousePrices housePrices2 =
                new HousePrices("Fernando","new","Apartment",3,40000,30,new StateTax("Ohio"));
        System.out.println(housePrices2.getPriceTotal());
        System.out.println(housePrices2.getPriceEachMonth());
        System.out.println(housePrices2.getUsername());
        HousePrices housePrices3 =
                new HousePrices("Emily","old","condo",4,30000,36,new StateTax("Florida"));
        System.out.println(housePrices3.getPriceTotal());
        System.out.println(housePrices3.getPriceEachMonth());
        System.out.println(housePrices3.getUsername());
        HousePrices housePrices4 =
                new HousePrices("Rinda","Renew Required","condo",1,50000,35,new StateTax("New Jersey"));
        System.out.println(housePrices4.getPriceTotal());
        System.out.println(housePrices4.getPriceEachMonth());
        System.out.println(housePrices4.getUsername());
    }
}
