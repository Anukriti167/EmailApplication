package Email;

public class Email {
    private String fname;
    private String lname;
    private String deptn;

    public Email(String fname, String lname, String deptn) {
        this.fname = fname;
        this.lname = lname;
        this.deptn = deptn;
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

    public String getDeptn() {
        return deptn;
    }

    public void setDeptn(String deptn) {
        this.deptn = deptn;
    }

    public static String emailID(String fname, String lname, String deptn){
        return fname.toLowerCase() + "." + lname.toLowerCase() + "@" + deptn.toLowerCase() + ".google.com";
    }

}
