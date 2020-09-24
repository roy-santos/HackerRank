package InterviewPrep.Arrays;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        int size = a.length;
        int[] rotated_arr = new int[size];

        int i = 0;
        int rotate_index = d;

        while (rotate_index < size) {
            rotated_arr[i] = a[rotate_index];
            i++;
            rotate_index++;
        }

        rotate_index = 0;
        while (rotate_index < d) {
            rotated_arr[i] = a[rotate_index];
            i++;
            rotate_index++;
        }

        return rotated_arr;
    }

    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{};


        for(int i=0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        int[] rotated = rotLeft(a, 2 );
         for(int i=0; i < rotated.length; i++) {
             System.out.print(rotated[i]);
        }
    }
}
