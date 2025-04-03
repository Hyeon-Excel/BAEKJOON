import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] digits = br.readLine().toCharArray();  // 성능 개선

        int sum = 0;
        for (char c : digits) {
            sum += c - '0';
        }

        System.out.println(sum);
    }
}