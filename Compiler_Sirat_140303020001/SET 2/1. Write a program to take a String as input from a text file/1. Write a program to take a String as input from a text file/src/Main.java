
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sirat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    Main() {
        String text = "";
        File file = new File("input.txt");
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(reader);
            String line = "";
            while ((line = bufferReader.readLine()) != null) {
                text = text + line + "\n";

            }
            System.out.println(text);

        } catch (IOException e) {
            System.out.println("Error!");
        }

    }

    public static void main(String[] args) {
        new Main();
    }

}
