package InterviewPrep.WarmUp;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ValleyCount {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int currLevel = 0;
        int valleyCount = 0;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == 'U') {
                if (currLevel == -1) {
                    valleyCount += 1;
                }
                currLevel += 1;
            } else {
                currLevel -= 1;
            }
        }
        return valleyCount;
    }

    public static void main(String[] args) throws IOException {

        System.out.print(countingValleys(8, "UDDDUDUU"));

    }
}

