package com.romaintestard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

    public static void main(String[] args){
        // 1. Define the path that we want to write
        String filename = "C:\\Users\\Romain\\Desktop\\Dev web\\JavaPrograms\\files\\files\\fileToWrite.txt";
        String message = "I'am data that will be placed to a file";

        // 2. Create the file in Java
        File file = new File(filename);


        try {
            // 3. Open the file
            FileWriter fw = new FileWriter(file);

            // 4. Write to the file
            fw.write(message);

            // 5. Close the ressources
            fw.close();
        } catch (IOException e) {
            System.out.println("Error: Could not rad files: " + filename);
            e.printStackTrace();
        } finally {
            System.out.println("Closing the filewriter");
        }



    }

}