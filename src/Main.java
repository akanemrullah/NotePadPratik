import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String path = "NotePad.txt";
        String textInput,textOutput;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(path));

            System.out.println("Once ki notlar");
            while ((textOutput = bReader.readLine()) != null){
                System.out.println(textOutput);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(path,true))){

            System.out.println("Not almak istedigin metni gir:");
            textInput = input.nextLine();

            bWriter.write(textInput);
            bWriter.newLine();
            System.out.println("Notun basariyla kaydedildi.");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}