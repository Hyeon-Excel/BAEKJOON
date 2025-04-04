import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2753 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int year = Integer.parseInt(br.readLine());

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(1);
        else 
            System.out.print(0);

        br.close();
    }

    public static void main(String[] args) throws Exception {
        new _2753().solution();
    }
}