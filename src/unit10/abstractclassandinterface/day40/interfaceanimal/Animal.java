package unit10.abstractclassandinterface.day40.interfaceanimal;

public abstract class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
    private void anotherMethod(){
        System.out.println("Breathe in, breathe out");
    }

    public void breathe(){
        anotherMethod();
    }

    public abstract void animalSound();
}
