package InterviewPrep.Arrays;

import java.util.Arrays;

public class twoDArrayDS {

    static int hourglassSum(int[][] arr) {

        int[] maxSum = new int[16];
        int maxSumIndex = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                maxSum[maxSumIndex] = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] +
                        arr[i+2][j+1] + arr[i+2][j+2];
                maxSumIndex++;
            }
        }
        Arrays.sort(maxSum);
        return maxSum[maxSum.length - 1];
    }

    public static void main(String[] args) {

        int value = 0;
        int[][] arr = new int[6][6];
        for (int i=0; i < arr.length; i++) {
            for (int j=0; j < arr.length; j++) {
                //arr[i][j] = (int) (Math.random() * 10);
                arr[i][j] += value + 1;
                value++;
            }
        }

        for (int i=0; i < arr.length; i++) {
            for (int j=0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Max Sum: " + hourglassSum(arr));
    }
}
