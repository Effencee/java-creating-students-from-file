package z4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    public static final String INPUT_FILE_NAME = "students.txt";

    public List<String> readFromFile(){
        List<String> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_FILE_NAME))) {
            String line;
            do {
                line=bufferedReader.readLine();
                if (line!=null)
                    list.add(line);
            }while (line!=null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
