package main.fileWorks;

import java.io.FileReader;
import java.io.IOException;

class FilePaths{

    final static String PATH() throws IOException{
        String path = "";
        try{
            FileReader reader = new FileReader ("/Path/Paths.txt");
            int c;
            while ((c=reader.read())!=-1){
              path += (char)c;
            }
        } catch (IOException e){
          System.out.println(e.getMessage());
        }
        return path;
    }
}
