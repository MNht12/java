import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Scanner;

public class getData {
    public static void main(String[] args) throws IOException {
        getData();
    }

    public static void getData() throws IOException
    {
        String name, address, fileName;
        int age;

//        System.out.println("File name:");
//        Scanner scanner = new Scanner(System.in);
//        fileName= scanner.nextLine();

        System.out.println("name:");
        Scanner scanner = new Scanner(System.in);
        name= scanner.nextLine();

        System.out.println("address:");
        address= scanner.nextLine();

        System.out.println("age:");
        age= scanner.nextInt();

        PrintWriter pw = null;

        try
        {
            pw = new PrintWriter(new FileWriter("src/myFile.txt", true));
            pw.println("Name: " + name + "\nAddress: " + address + "\nAge: " + age);
        }
        catch (IOException ioe)
        {
            System.err.println(ioe.getMessage());
        }
        finally {
            if (pw != null)
                pw.close();
        }
    }
}