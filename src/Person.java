public class Person {
    protected String firstName;
    protected String lastName;
    protected String ID;
    protected String title;
    protected int YOB;

    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    public String toCSV() {
        return firstName + "," + lastName + "," + ID + "," + title + "," + YOB;
    }

    public String toXML() {
        return "<Person><FirstName>" + firstName + "</FirstName><LastName>" + lastName +
                "</LastName><ID>" + ID + "</ID><Title>" + title + "</Title><YOB>" + YOB + "</YOB></Person>";
    }

    public String toJSON() {
        return "{\"FirstName\": \"" + firstName + "\", \"LastName\": \"" + lastName +
                "\", \"ID\": \"" + ID + "\", \"Title\": \"" + title + "\", \"YOB\": " + YOB + "}";
    }
}