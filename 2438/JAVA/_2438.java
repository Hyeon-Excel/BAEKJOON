import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2438 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
    public static void main(String[] args) throws Exception{
        new _2438().solution();
    }
}