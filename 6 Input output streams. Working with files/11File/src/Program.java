import java.io.File;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        // define an object for the directory
        File dir = new File("SomeDir");
        // if the object represents a directory
        if(dir.isDirectory())
        {
            // get all nested objects in the directory
            for(File item : dir.listFiles()){

                if(item.isDirectory()){

                    System.out.println(item.getName() + "  \t folder");
                }
                else{

                    System.out.println(item.getName() + "\t file");
                }
            }
        }

        // define an object for the directory
        dir = new File("SomeDir//NewDir");
        boolean created = dir.mkdir();
        if(created)
            System.out.println("Folder has been created");
        // rename the directory
        File newDir = new File("SomeDir//NewDirRenamed");
        dir.renameTo(newDir);
        // delete the directory
        boolean deleted = newDir.delete();
        if(deleted)
            System.out.println("Folder has been deleted");

        // define an object for the directory
        File myFile = new File("SomeDir//notes.txt");
        System.out.println("File name: " + myFile.getName());
        System.out.println("Parent folder: " + myFile.getParent());
        if(myFile.exists())
            System.out.println("File exists");
        else
            System.out.println("File not found");

        System.out.println("File size: " + myFile.length());
        if(myFile.canRead())
            System.out.println("File can be read");
        else
            System.out.println("File can not be read");

        if(myFile.canWrite())
            System.out.println("File can be written");
        else
            System.out.println("File can not be written");

        // create a new file
        File newFile = new File("SomeDir//MyFile");
        try
        {
            boolean created1 = newFile.createNewFile();
            if(created1)
                System.out.println("File has been created");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}