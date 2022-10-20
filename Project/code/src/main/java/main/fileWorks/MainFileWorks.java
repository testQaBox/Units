package main.fileWorks;

import java.util.ArrayList;
import java.io.IOException;

import support.Support;

public class MainFileWorks {

    public MainFileWorks() throws IOException{

        FilesInFolder fileList = new FilesInFolder();
        ArrayList<String> toChose = fileList.getListOfFiles();

        System.out.println("Chose first file");
        int  firstIndex = Support.SCAN_SC.nextInt();
        FileData file1 = new FileData(fileList.getPathOfFolder(), toChose.get(firstIndex-1));

        System.out.println("Chose second file");
        int  secondIndex = Support.SCAN_SC.nextInt();
        FileData file2 = new FileData(fileList.getPathOfFolder(), toChose.get(secondIndex-1));

        ArrayList<FileData> data = new ArrayList<>();
        data.add(file1);
        data.add(file2);
        System.out.println(data.get(0).getFileName() + "   <---|||--->   " + data.get(1).getFileName());
        System.out.println(data.get(0).getFileData().size() + "   <---|Sizes|--->   " + data.get(1).getFileData().size());
        FileDataComparing.getComparedData(data);

    }

}
