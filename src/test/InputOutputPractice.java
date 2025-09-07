package test;

import java.io.*;
import java.util.*;

/**
 * 입출력 & StringTokenizer 연습용 예제
 *
 * - 입력: 첫 줄에 정수 N, M (공백으로 구분)
 * - 출력: "N: x, M: y" 형식으로 출력
 *
 * 예시 입력:
 * 10 20
 *
 * 예시 출력:
 * N: 10, M: 20
 */
public class InputOutputPractice {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 이용해 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄 읽기
        String line = br.readLine();

        // StringTokenizer로 공백 단위 분리
        StringTokenizer st = new StringTokenizer(line);

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        System.out.println("N: " + N + ", M: " + M);
    }
}
