package main.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/**
 * 백준 1193번: 분수찾기
 *
 * 문제 요약:
 *  - 무한히 분수가 대각선 형태로 나열되어 있음.
 *  - 예) 1/1 → 1/2 2/1 → 3/1 2/2 1/3 → ...
 *  - 입력으로 N이 주어졌을 때, N번째 분수를 출력해야 함.
 *
 * 핵심 아이디어:
 *  - 몇 번째 대각선(n)에 속하는지 먼저 계산
 *  - 그 대각선 내에서 몇 번째(cnt) 위치인지 구함
 *  - 대각선이 짝수냐 홀수냐에 따라 (분자/분모) 순서를 다르게 배치
 */
public class P1193 {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위한 BufferedReader 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 빠른 출력을 위한 BufferedWriter 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 한 줄 입력 받아 정수로 변환
        String s = br.readLine();
        int num = Integer.parseInt(s);

        // 현재 대각선 번호 (1부터 시작)
        int n = 1;
        // 지금까지 몇 개의 분수가 채워졌는지 누적합
        int sum = 0;

        // num이 속한 대각선 찾기
        // 대각선의 길이는 1, 2, 3, ... 이므로
        // sum + n >= num 이 되는 순간 멈춤
        while(num > sum + n) {
            sum += n; // 이전 대각선까지의 누적합
            n++;      // 다음 대각선으로 이동
        }

        // 해당 대각선 안에서 몇 번째 위치인지 계산
        int cnt = num - sum;

        // 분자, 분모 초기화
        int a = 0;
        int b = 0;

        // 대각선 번호가 짝수인 경우 ↘ 방향 (왼쪽 아래 → 오른쪽 위)
        if(n % 2 == 0) {
            b = n + 1 - cnt; // 분모 계산
            a = cnt;         // 분자 계산
        }
        // 대각선 번호가 홀수인 경우 ↗ 방향 (오른쪽 위 → 왼쪽 아래)
        else {
            a = n + 1 - cnt; // 분자 계산
            b = cnt;         // 분모 계산
        }

        // 결과 출력
        bw.write(a + "/" + b);
        bw.flush();

        // 리소스 정리
        br.close();
        bw.close();
    }
}
