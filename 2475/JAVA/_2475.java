import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2475 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        int check = 0;
        for(int i = 0; i < 5; i++){
            check += arr[i] * arr[i];
        }
        check = check % 10;
        System.out.println(check);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new _2475().solution();
    }
}