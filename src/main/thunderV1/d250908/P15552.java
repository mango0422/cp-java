package main.thunderV1.d250908;

import java.io.*;
import java.util.*;

public class P15552 {
    public static void main(String[] args) throws IOException{ // IOException 안하면 오류 발생
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner 안쓰고 빠른 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // println 안쓰고 빠른 출력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            int sum = arr[i][0] + arr[i][1];
            bw.write(sum + "\n");
        }
        bw.flush();
    }
}
