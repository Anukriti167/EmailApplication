package Email;

public class ChangeEmail {
    private String fname;
    private String lname;

    public ChangeEmail(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String newEmailID(String fname, String lname){
        return lname.toLowerCase() + "." + fname.toLowerCase() + "@google.com";
    }
}
