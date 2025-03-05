import java.util.*;
public class cnt_decoding {
    public static int cnt_decoding_digits(char[] dig, int a) {
        if (a == 0 || dig[0] == '0') {
            return 0;  // If the first character is '0' or input is empty, no valid decodings
        }

        int[] cnt = new int[a + 1];  // dp array to store the number of ways to decode
        cnt[0] = 1;  // There's one way to decode an empty string
        cnt[1] = 1;  // There's one way to decode the first character (as long as it's not '0')

        // Loop through the string starting from the second character
        for (int k = 2; k <= a; k++) {
            cnt[k] = 0;  // Initialize the count for current position

            // If the current digit is not '0', it can be decoded as a single digit
            if (dig[k - 1] != '0') {
                cnt[k] += cnt[k - 1];
            }

            // Check if the last two digits form a valid number between 10 and 26
            int twoDigit = (dig[k - 2] - '0') * 10 + (dig[k - 1] - '0');
            if (twoDigit >= 10 && twoDigit <= 26) {
                cnt[k] += cnt[k - 2];
            }
        }

        return cnt[a];  // The result will be in cnt[a], the number of decodings for the full string
    }

    public static void main(String[] args) {
        String s = "12334213441";  // Example input string
        char[] dig = s.toCharArray();  // Convert the string to a character array
        System.out.println(cnt_decoding_digits(dig, dig.length));  // Pass the full length of the string
    }
}
