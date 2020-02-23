/* Caroline Resler
 * Project 1 CompSci 282
 * Due By Oct 5th
 * Last Worked on Oct 5th
 * MyFixedRecord.java has get set and toSting also Adds spaces to Char array
 */
package Package;


     
public class MyFixedRecord {
    private char[] first=new char[10];
    private char[] last=new char[15];
    private char[] email=new char[25];
    private char[] color=new char[10];
    private char[] id=new char[10];
    private char[] bal=new char[10];
    MyFixedRecord(){
        
    }
    public void setfirst(String newfirst){
        char[] temp = newfirst.toCharArray();
        for(int i = 0;i< temp.length;i++){
            first[i] = temp[i];
        }
        
        //System.out.println(first[9]);
        for (int j=0;j<first.length;j++)
        {
            if(first[j]=='\u0000')
                first[j]=' ';
        }
    }
    public void setlast(String newlast){
       char[] temp = newlast.toCharArray();
        for(int i = 0;i< temp.length;i++){
            last[i] = temp[i];
        } 
        for (int j=0;j<last.length;j++)
        {
            if(last[j]=='\u0000')
                last[j]=' ';
        }
    }
    public void setemail(String newemail){
        char[] temp = newemail.toCharArray();
        for(int i = 0;i< temp.length;i++){
            email[i] = temp[i];
        }
        for (int j=0;j<email.length;j++)
        {
            if(email[j]=='\u0000')
                email[j]=' ';
            
        }
    }
    public void setcolor(String newcolor){
        char[] temp = newcolor.toCharArray();
        for(int i = 0;i< temp.length;i++){
            color[i] = temp[i];
        }
        for (int j=0;j<color.length;j++)
        {
            if(color[j]=='\u0000')
                color[j]=' ';
        }
    }
    public void setid(int newid){
       char[] temp =Integer.toString(newid).toCharArray();
        for(int i = 0;i< temp.length;i++){
            id[i] = temp[i];
        }
        for (int j=0;j<id.length;j++)
        {
            if(id[j]=='\u0000')
                id[j]=' ';
        }
    }
    public void setbal(double newbal){
        char[] temp = Double.toString(newbal).toCharArray();
        for(int i = 0;i< temp.length;i++){
            bal[i] = temp[i];
        }
        for (int j=0;j<bal.length;j++)
        {
            if(bal[j]=='\u0000')
                bal[j]=' ';
        }
    }
    public char[] getfirst() {
       return first;
    }
    public char[] getlast() {
       return last;
    }
    public char[] getemail() {
       return email;
    }
    public char[] getcolor() {
       return color;
    }
    public char[] getid() {
       return id;
    }
    public char[] getbal() {
       return bal;
    }
    
    /*public String toString() {
        return (first+ last + email + color + id + bal);
    }*/
    
}
