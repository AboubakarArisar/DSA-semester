import java.util.*;
import java.io.*;

public class NLArray {
    public static String[] wordTokenize(String filename) {
        String data = "";
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                data += sc.nextLine() ;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int wordCounter = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == ' ') {
                wordCounter++;
            }
        }

        String[] words = new String[wordCounter + 1];
        int index = 0;
        String word = "";
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            if (ch == ' ') {
                words[index++] = word;
                word = "";
            } else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                word += ch;
            }
        }
        
        
        if (!word.equals("")) {
            words[index] = word;
        }
        
        return words;
    }

    public static void main(String[] args) {
        String[] finalString = wordTokenize("E:\\sample.txt");
        for (int i = 0; i < finalString.length; i++) {
            System.out.print(finalString[i] + " ");
        }
    }
}
