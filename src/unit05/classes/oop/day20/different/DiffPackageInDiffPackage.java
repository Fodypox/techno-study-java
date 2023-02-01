package unit05.classes.oop.day20.different;

import unit05.classes.oop.day20.encapsulation.EncapsulationExample;

public class DiffPackageInDiffPackage {
    public static void main(String[] args) {
        EncapsulationExample a = new EncapsulationExample();
//        System.out.println(a.privateInt);
//        System.out.println(a.defaultInt);
        System.out.println(a.publicInt);
//        System.out.println(a.defaultInt);
    }
}
