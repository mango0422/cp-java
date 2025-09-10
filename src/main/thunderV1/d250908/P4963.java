package main.thunderV1.d250908;

import java.io.*;
import java.util.*;

public class P4963 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int w = 1;
        int h = 1;
        String str = "";
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w == 0 && h == 0) break;
            int[][] arr = new int[w][h];
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    arr[i][j] = Integer.parseInt(br.readLine());
                    // 섬을 센다. 섬은 가로, 세로 혹은 대각선으로 이어져있어야 한다.
                    // 그렇다면 입력받은 것을 기준으로 어떻게 처리할까?
                    // 섬의 개수를 이어져있는 사각형 기준으로 이어진 것을 하나의 묶음으로 생각해서 세는 방식으로 할까?
                    // 근데 이게 현실적으로 알고리즘 구현이 되나? 효율적인가?
                    // 되는지 먼저 검증을 해보자.
                    int sum = 0; // 여기에 실제 섬의 개수를 쓸거야.
                    bw.write(sum + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
