package clases;

public class User {
    private int document;
    private String user;
    private String names;
    private String lastName;
    private String pass;
    private String status;


    public User(){

    }

    public User(int document, String user, String names, String lastName, String pass, String status) {
        this.document = document;
        this.user = user;
        this.names = names;
        this.lastName = lastName;
        this.pass = pass;
        this.status = status;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public int getStatus() {
        return document;
    }

    public void setStatus(int document) {
        this.document = document;
    }
    @Override
    public String toString() {
        return "User{" +
                "document=" + document +
                ", user='" + user + '\'' +
                ", names='" + names + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pass='" + pass + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
