package unit06.array.day24.arrayreview;

public class Person {
    private String[] friends;
    private String name;

    public Person(String[] friends, String name) {
        this.friends = friends;
        this.name = name;
    }

    public String[] getFriends() {
        return friends;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
