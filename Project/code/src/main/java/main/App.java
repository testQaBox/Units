package main;

import java.io.IOException;

import main.fileWorks.MainFileWorks;


public class App {

    public static void main( String[] args) throws IOException{
        System.out.println("\n\n");
        MainFileWorks start = new MainFileWorks();
        System.out.println("\n\n");
        start.hashCode();;

    }
}

/*
    mvn clean
    mvn compile
    mvn install
    mvn exec:java -Dexec.mainClass="main.App"

*/
