import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        File file = new File("tar.txt");
        try {
            Scanner scanner =new Scanner(file);
//            String result = null;
            while (scanner.hasNext()){
                System.out.print(scanner.nextLine()+" ");
//                scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
