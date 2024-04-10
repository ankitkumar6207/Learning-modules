import java.io.*;
import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
    // create
    
    try {
      File fo = new File("new-file.txt");
      fo.createNewFile();
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }

    // write in the file
    try {
      FileWriter fw = new FileWriter("new-file.txt");
      fw.write("ankit kumar");
      fw.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    // reading from a file
    try (BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))) {
      while (br.ready()) {
        System.out.println(br.readLine());
      }
    } catch (IOException e) {
        System.out.println(e.getMessage());      
    }

    // create
    try {
      File fo = new File("random.txt");
      fo.createNewFile();
      if(fo.delete()) {
        System.out.println(fo.getName());
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    
    
  }
}