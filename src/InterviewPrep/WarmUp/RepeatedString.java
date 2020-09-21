package InterviewPrep.WarmUp;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        long count = 0;
        long numOfAinString = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                numOfAinString += 1;
            }
        }
        for (int i = 0; i < n%s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count += 1;
            }
        }
        count = count + (n / s.length() * numOfAinString);

        return count;
    }

    public static void main(String[] args) {

        System.out.println(repeatedString("a", 1000000000));

    }
}
