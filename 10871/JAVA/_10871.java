import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10871 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            if(arr[i] < X){
                System.out.print(arr[i] + " ");
            }
        }

        br.close();
    }

    public static void main(String[] args) throws Exception {
        new _10871().solution();
    }
}