import java.io.*;
import java.util.*;

public class NLArray2 {
    public static String[] extractEmail(String filename) {
        String emails = "";

        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] words = splitFunc(line);
                for (String word : words) {
                    if (word != null && !word.isEmpty() && word.contains("@")) {
                        emails += word + " ";
                    }
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] finalemails = splitFunc(emails);
        removeMark(finalemails);
        return finalemails;
    }

    public static String[] splitFunc(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == ' ') {
                count++;
            }
        }

        String[] returnString = new String[count + 1];

        int index = 0;
        String word = "";
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == ' ') {
                returnString[index++] = word;
                word = "";
            } else {
                word += c;
            }
        }

        returnString[index] = word;

        return returnString;
    }

    public static void removeMark(String[] emails) {
        for (int i = 0; i < emails.length; i++) {
            if (emails[i] != null) {
                emails[i] = removeAtSymbol(emails[i]);
            }
        }
    }

    public static String removeAtSymbol(String email) {
        String result = "";
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (c != '@') {
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String emails[] = extractEmail("E:\\email.txt");
        boolean flag = false;
        for (String s : emails) {
            if (s != null && !s.isEmpty()) {
                System.out.print(s + " ");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No emails found in the file");
        }
    }
}
