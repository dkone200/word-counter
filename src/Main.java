import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);

        String sentence = "";
        int counter =0;

        System.out.println("Please insert a path");
        sentence=sc.nextLine();

        char[] path = sentence.toCharArray();



        StringTokenizer word = new StringTokenizer(sentence);

        counter = word.countTokens();




        System.out.println("The number of word in the string is: "+ counter);

     //   int counter =0;
        boolean isIn = false;
        String parola;
        File file = new File("C:\\Users\\drama\\Desktop\\Java_Test\\test1.txt");
        Scanner reader = new Scanner(file);

        FileWriter fileWriter = new FileWriter("C:\\Users\\drama\\Desktop\\Java_Test\\test2.txt");


       fileWriter.write("This is a test to test the tests that I have been testing recently");
        fileWriter.close();
        while (reader.hasNextLine()){

            String data = reader.nextLine();
        //    StringTokenizer word = new StringTokenizer(data);
            parola=word.toString();
            counter = counter + word.countTokens();
       //     System.out.println(data);
            System.out.println(data);
            if (data.contains("filett")){
                isIn=true;
            }

        }
        reader.close();
        System.out.println("\nThe number of word in the string is: "+ counter);
        System.out.println(isIn);

    }
}
