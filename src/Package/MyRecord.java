/* Caroline Resler
 * Project 1 CompSci 282
 * Due By Oct 5th
 * Last Worked on Oct 5th
 * MyRecord.java Constuctor with get set and toSting method
 */
package Package;

public class MyRecord {

    String firstname;
    String lastname;
    String email;
    String color;
    int idnumber;
    double balance;

    MyRecord(String newfname, String newlname, String newemail, String newcolor, int newidnumber, double newbalance) {
        firstname = newfname;
        lastname = newlname;
        email = newemail;
        color = newcolor;
        idnumber = newidnumber;
        balance = newbalance;
    }

    public void setfirstname(String newfname) {
        firstname = newfname;
    }

    public void setlastname(String newlname) {
        lastname = newlname;
    }

    public void setemail(String newemail) {
        email = newemail;
    }

    public void setcolor(String newcolor) {
        color = newcolor;
    }

    public void setidnumber(int newidnumber) {
        idnumber = newidnumber;
    }

    public void setbalance(double newbalance) {
        balance = newbalance;
    }
    public String getfirstname() {
       return firstname;
    }
    public String getlastname() {
       return lastname;
    }
    public String getemail() {
       return email;
    }
    public String getcolor() {
       return color;
    }
    public int getidnumber() {
       return idnumber;
    }
    public double getbalance() {
       return balance;
    }
    
    public String toString() {
        return (firstname + " " + lastname + " " + email + " " + color + " " + idnumber + " " + balance);
    }
}
