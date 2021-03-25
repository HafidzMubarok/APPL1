// **************************************************************************** 
// CopyFile.java 
// 
// Write a program that prompts the user for a filename, then opens a Scanner  
// to the file and copies it, a line at a time, to the standard output.
// ****************************************************************************

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CopyFile {

    public static void main(String[] args) {
        boolean rightName = false;
        String copy;
        Scanner scan = new Scanner(System.in);
        while(!rightName){
            try{
                System.out.println("\nEnter the file name: ");
                copy = scan.nextLine();
                File readFile = new File(copy);
                Scanner myReader = new Scanner(readFile);
                System.out.println("\nIsi File: ");
                while(myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
                rightName = true;
            } catch(FileNotFoundException e){
                System.out.println("\nWrong file name. enter the correct "
                        + "file name \n");
            }
        }
        
    }
    
}
