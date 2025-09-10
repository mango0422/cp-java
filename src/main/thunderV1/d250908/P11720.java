package main.thunderV1.d250908;

import java.io.*;
import java.util.*;

public class P11720 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        String[] arr = str.split("");
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += Integer.parseInt(arr[i]);
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
