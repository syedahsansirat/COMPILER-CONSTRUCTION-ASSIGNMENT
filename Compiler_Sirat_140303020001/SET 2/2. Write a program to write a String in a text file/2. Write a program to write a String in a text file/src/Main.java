
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
    Main(String text) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write(text);
            System.out.println("Successful!\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    public static void main(String[] args) {
        Scanner in;
        System.out.println("Enter Text!");
        in = new Scanner(System.in);
        String text = in.nextLine();
        new Main(text);
    }

}
