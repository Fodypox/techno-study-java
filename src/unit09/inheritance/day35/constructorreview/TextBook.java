package unit09.inheritance.day35.constructorreview;

public class TextBook extends Book{
    private String subject;

    public TextBook(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
