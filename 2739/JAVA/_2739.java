import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2739 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i < 10; i++){
            int result = N * i;
            System.out.println(N + " * " + i + " = " + result);
        }
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new _2739().solution();
    }
}