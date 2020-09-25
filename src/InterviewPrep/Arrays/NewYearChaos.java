package InterviewPrep.Arrays;

import java.util.Arrays;

public class NewYearChaos {

    static void minimumBribes(int[] q) {
        int size = q.length;
        int swaps = 0;

        for (int i=size-1; i >= 0; i-- ) {
            if (q[i] != i+1) {
                if ((i-1) >= 0 && q[i-1] == i+1) {
                    int temp = q[i-1];
                    q[i-1] = q[i];
                    q[i] = temp;
                    swaps++;
                } else if ((i-2) >= 0 && q[i-2] == i+1) {
                    int temp = q[i-2];
                    q[i-2] = q[i-1];
                    q[i-1] = q[i];
                    q[i] = temp;
                    swaps +=2;
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(swaps);
    }

    public static void main(String[] args) {

        int[] a = new int[]{1, 5, 2, 4, 3};

        minimumBribes(a);
    }
}
