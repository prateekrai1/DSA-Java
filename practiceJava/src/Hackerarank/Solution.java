package Hackerarank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'gameWinner' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING colors as parameter.
     */

    public static String gameWinner(String colors) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        input.nextLine();
        String winner = "";
        boolean wendyTurn = true;

        if(wendyTurn){
            if(colors.contains("www")){
                colors = colors.replaceFirst("www", "w");;
                wendyTurn = false;
            }
            else{
                winner = "bob";
            }
        }
        else{
            if(colors.contains("bb")){
                colors = colors.replaceFirst("bb", "b");
                wendyTurn = true;
            }
            else{
                winner = "wendy";
            }
        }
        return winner;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String colors = bufferedReader.readLine();

        String result = Result.gameWinner(colors);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


