
// java_03_05_2741

import java.io.*;
import java.util.*;

public class java_03_04_15552 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//����
		
		int n = Integer.parseInt(br.readLine()); //String
	
        for (int i = 1; i <= n; i++) {
			bw.write(i + "\n");
        }
        bw.close();
		bw.flush();
		br.close();
	}
}
