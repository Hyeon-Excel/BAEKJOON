import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(N - i)).append("*".repeat(i)).append("\n");
        }

        System.out.print(sb);
    }
}
