import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) {
        //Creating the file
//        File file=new File("xyz.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create the file.");
//            throw new RuntimeException(e);
//        }

        //Write in file
//        try {
//            FileWriter fileWriter=new FileWriter("xyz.txt");
//            fileWriter.write("Hello guys...");
//
//            fileWriter.close();
//        } catch (IOException e) {
//            System.out.println("Unable to write in file.");
//            throw new RuntimeException(e);
//        }

        //read from file
//        File myfile= new File("xyz.txt");
//        try {
//            Scanner sc=new Scanner(myfile);
//            while(sc.hasNextLine()){
//                String line=sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }

        //deleting the file
        File myfile= new File("xyz.txt");
        if(myfile.delete()){
            System.out.println("File "+ myfile.getName()+" has been deleted successfully ");
        }
        else {
            System.out.println("File can't be deleted");
        }
    }
}
