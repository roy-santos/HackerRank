package InterviewPrep.WarmUp;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int numJumps = 0;
        int i = 0;

        while (i < c.length - 1) {
            if (i + 2 < c.length) {
                if (c[i + 2] == 0) {
                    numJumps++;
                    i += 2;
                } else {
                    numJumps += 1;
                    i++;
                }
            } else {
                numJumps++;
                i++;
            }
        }
        return numJumps;
    }

    public static void main(String[] args) {

        int[] test1 = new int[]{0, 0, 0, 1, 0, 0};
        System.out.println(jumpingOnClouds(test1));
    }
}
