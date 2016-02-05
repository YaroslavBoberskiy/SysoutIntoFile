import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\YB\\Desktop\\test.txt");

        PrintStream out = null;
        try {
            out = new PrintStream(new FileOutputStream(file, true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(out);

        System.out.println("Hello World!");
    }
}
