import java.io.*;
import java.util.zip.*;

public class Program {

    public static void main(String[] args) {

        String filename = "SomeDir\\notes.txt";
        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("SomeDir\\output.zip"));
            FileInputStream fis= new FileInputStream(filename);)
        {
            ZipEntry entry1=new ZipEntry("notes.txt");
            zout.putNextEntry(entry1);
            // read the contents of the file into a byte array
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            // add content to the archive
            zout.write(buffer);
            // close the current record for a new record
            zout.closeEntry();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        try(ZipInputStream zin = new ZipInputStream(new FileInputStream("SomeDir\\output.zip")))
        {
            ZipEntry entry;
            String name;
            long size;
            while((entry=zin.getNextEntry())!=null){

                name = entry.getName(); // get the file name
                size=entry.getSize();  // get its size in bytes
                System.out.printf("File name: %s \t File size: %d \n", name, size);

                // unpacking
                FileOutputStream fout = new FileOutputStream("somedir\\new" + name);
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}