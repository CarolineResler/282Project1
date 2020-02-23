/* Caroline Resler
 * Project 1 CompSci 282
 * Due By Oct 5th
 * Last Worked on Oct 5th
 * Main.java has the menu for user input and reads file and put it in record objects
 */
package Package;

import java.util.Scanner;
import java.io.*;


public class Main {

    public static final int ARRAYSIZE = 10;
    private static MyRecord[] array = new MyRecord[ARRAYSIZE];
    private static int totalrecords = 0;
    private static MyFixedRecord[] array2 = new MyFixedRecord[ARRAYSIZE];
    public static final int HASHSIZE = 1001;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        int value = 0;
        arrayline();
        while (value >= 0) {
            System.out.println("Please enter record number");
            value=input.nextInt();
            if(value >= totalrecords){
                System.out.println("invalid Please enter different number");
                
            }
            else if(value >=0 && value <totalrecords){
                System.out.println(array[value].toString());
                System.out.println( "Key " + array[value].getemail() + " should be stored in bucket#: " + hashFunc3(array[value].getemail()) );
            }
        }
        for(int i =0; i <totalrecords; i++){
            array2[i]= new MyFixedRecord();
            array2[i].setfirst(array[i].getfirstname());
            array2[i].setlast(array[i].getlastname());
            array2[i].setemail(array[i].getemail());
            array2[i].setcolor(array[i].getcolor());
            array2[i].setid(array[i].getidnumber());
            array2[i].setbal(array[i].getbalance());
            
        }
        File outFile= new File("fixed.txt");
        PrintWriter outputFile = new PrintWriter(outFile);
        for(int i =0; i <totalrecords; i++){
        outputFile.print(array2[i].getfirst());
        outputFile.print(array2[i].getlast());
        outputFile.print(array2[i].getemail());
        outputFile.print(array2[i].getid());
        outputFile.print(array2[i].getcolor());
        outputFile.println(array2[i].getbal());
        }
        outputFile.close();
        
    }

    private static void arrayline() throws FileNotFoundException {
        File inFile = new File("data.txt");

        Scanner sc = new Scanner(inFile);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            String firstname = line.substring(0, line.indexOf(","));
            
            line = line.substring(line.indexOf(",")+2);
           
            String lastname = line.substring(0, line.indexOf(","));

            line = line.substring(line.indexOf(",")+2);
            
            String email = line.substring(0, line.indexOf(","));

            line = line.substring(line.indexOf(",")+2);
            
            int idnumber = Integer.parseInt(line.substring(0, line.indexOf(",")));

            line = line.substring(line.indexOf(",")+2);  

            String color = line.substring(0, line.indexOf(","));

            line = line.substring(line.indexOf(",")+2);
            
            double balance = Double.parseDouble(line);
          
            array[totalrecords++] = new MyRecord(firstname, lastname, email, color, idnumber, balance);
        }

        sc.close();
    }
    public static int hashFunc3(String key) {
        int hashval = 0;
        for (int j = 0; j < key.length(); j++) {
            int letter = key.charAt(j) - 96;
            if (letter > 0) {
                hashval = (hashval * 27 + letter) % HASHSIZE;
            }
        }
        return hashval;
    }
    
}
