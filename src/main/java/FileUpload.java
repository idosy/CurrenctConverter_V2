import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.awt.Desktop;
import java.io.*;

public class FileUpload {


    public void FileUpload(ArrayList ResultList) {
        try {

            File statText = new File("C:\\results\\results.txt");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);

            w.write(String.valueOf(ResultList));
            w.close();



        } catch (IOException e) {
            System.err.println("Problem writing to the file results.txt");
        }
    }
}
