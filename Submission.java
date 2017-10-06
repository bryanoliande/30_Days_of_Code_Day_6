import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] strings = new String[T];
        scanner.nextLine();
        
        for (int i = 0; scanner.hasNextLine(); i++) {
            strings[i] = scanner.nextLine();
        }
        
        for(int i = 0; i < strings.length; i++) {
            String evenStr = "";
            String oddStr = "";
            for(int j = 0; j < strings[i].length(); j++) {
                if (j % 2 == 0) {
                    evenStr = evenStr.concat(strings[i].substring(j, j + 1));
                }
                else {
                    oddStr = oddStr.concat(strings[i].substring(j, j + 1));
                }
            }
           System.out.println(evenStr + " " + oddStr);    

        }
    }
}