package main.fileWorks;

import java.util.ArrayList;

class FileDataComparing {

    private static ArrayList<FileData> comparedData = new ArrayList<FileData>();

    private static ArrayList<FileData> toComparing (ArrayList<FileData> data){
        int maxLength = 0;
        int minLength = 0;

        if (data.get(0).getFileData().size() < data.get(1).getFileData().size()){
            maxLength = data.get(1).getFileData().size();
            minLength = data.get(0).getFileData().size();
            while (!(minLength == maxLength)){    
              data.get(0).getFileData().add("------");
              minLength++;
            }
            System.out.println(minLength);
          } else {
            maxLength = data.get(0).getFileData().size();
            minLength = data.get(1).getFileData().size();
            while (!(minLength == maxLength)){
                data.get(1).getFileData().add("------");
              minLength++;
            }
          }
        
        return data;
    }

    private static void compareData(ArrayList<FileData> data){
        comparedData = toComparing(data);
        for (int i = 0; i < comparedData.get(0).getFileData().size(); i++){
            if (comparedData.get(0).getFileData().get(i).equals(comparedData.get(1).getFileData().get(i)) && comparedData.get(1).getFileData().get(i).equals(comparedData.get(0).getFileData().get(i))){
              System.out.println((i+1) + ".  " + comparedData.get(0).getFileData().get(i));
            } else {
              System.out.println((i+1) + ".  " + comparedData.get(0).getFileData().get(i) + " <---|||---> " + comparedData.get(1).getFileData().get(i));
            }
        }
    }

    static ArrayList<FileData> getComparedData(ArrayList<FileData> data) {
        compareData(data);
        return comparedData;
    }
    
}
