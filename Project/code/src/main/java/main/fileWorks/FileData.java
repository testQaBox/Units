package main.fileWorks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class FileData {

    private ArrayList<String> fileData = new ArrayList<>();
    private String fileName;
    private int strCounter = 0;


    FileData(String path, String fileName){
        try{
            File file = new File(path + fileName);
            this.fileName = fileName;
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                this.fileData.add(scan.nextLine().trim());
                strCounter++;
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    ArrayList<String> getFileData() {
        return fileData;
    }

    String getFileName() {
        return fileName;
    }

    int getStrCounter() {
        return strCounter;
    }
    
}
