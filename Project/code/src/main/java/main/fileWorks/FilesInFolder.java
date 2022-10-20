package main.fileWorks;

import java.io.File;
import java.util.ArrayList;
import java.io.IOException;



class FilesInFolder{

    private ArrayList<String> listOfFiles = new ArrayList<>();
    private String pathOfFolder = FilePaths.PATH();

    FilesInFolder () throws IOException{
        File file = new File(this.pathOfFolder);
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++){
            String str1 = files[i].getName();
            this.listOfFiles.add(str1);
            System.out.println("--> " + (i+1) + ". " + this.listOfFiles.get(i));
        }
    }

    ArrayList<String> getListOfFiles() {
        return listOfFiles;
    }

    String getPathOfFolder() {
         return pathOfFolder;
     }

}
