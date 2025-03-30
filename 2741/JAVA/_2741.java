import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2741 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws Exception{
        new _2741().solution();
    }
}