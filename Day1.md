# 📖 벼락치기 코테 준비

## 1. 자바 코테 필수 문법 & 호출 패턴 (2시간 30분 플랜)

### 1-1. 입출력 (I/O)

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        bw.write((a+b) + "\n");
        bw.flush();
    }
}
```

* **핵심 포인트**

    * `BufferedReader` + `StringTokenizer` = 빠른 입력
    * `BufferedWriter` or `StringBuilder` = 빠른 출력

* **연습 문제**

    * [15552번 빠른 A+B](https://www.acmicpc.net/problem/15552)

---

### 1-2. 배열 & 문자열

```java
String s = br.readLine();
char[] arr = s.toCharArray();
for (char c : arr) { ... }
```

```java
int n = Integer.parseInt(br.readLine());
int[][] grid = new int[n][n];
for (int i = 0; i < n; i++) {
    st = new StringTokenizer(br.readLine());
    for (int j = 0; j < n; j++) {
        grid[i][j] = Integer.parseInt(st.nextToken());
    }
}
```

* **연습 문제**

    * [11720번 숫자의 합](https://www.acmicpc.net/problem/11720)
    * [2738번 행렬 덧셈](https://www.acmicpc.net/problem/2738)

---

### 1-3. DFS / BFS

```java
// DFS (재귀)
void dfs(int x, int y) {
    visited[x][y] = true;
    for (int d=0; d<4; d++) {
        int nx = x + dx[d], ny = y + dy[d];
        if (범위체크 && !visited[nx][ny] && 조건) {
            dfs(nx, ny);
        }
    }
}
```

```java
// BFS (큐)
Queue<int[]> q = new LinkedList<>();
q.add(new int[]{x, y});
visited[x][y] = true;

while (!q.isEmpty()) {
    int[] cur = q.poll();
    for (int d=0; d<4; d++) {
        int nx = cur[0] + dx[d], ny = cur[1] + dy[d];
        if (범위체크 && !visited[nx][ny] && 조건) {
            visited[nx][ny] = true;
            q.add(new int[]{nx, ny});
        }
    }
}
```

* **연습 문제**

    * [4963번 섬의 개수](https://www.acmicpc.net/problem/4963) (DFS)
    * [1697번 숨바꼭질](https://www.acmicpc.net/problem/1697) (BFS)

---

### 1-4. 백트래킹

```java
void backtrack(int depth) {
    if (depth == n) {
        // 결과 처리
        return;
    }
    for (int i=0; i<n; i++) {
        if (!used[i]) {
            used[i] = true;
            arr[depth] = i;
            backtrack(depth+1);
            used[i] = false;
        }
    }
}
```

* **연습 문제**

    * [15649번 N과 M (1)](https://www.acmicpc.net/problem/15649)

---

### 1-5. 정렬 & 투포인터

```java
Arrays.sort(arr);  // 오름차순
Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 (Integer[]만 가능)
```

```java
int left=0, right=n-1;
while (left < right) {
    int sum = arr[left] + arr[right];
    if (sum == target) ...
    else if (sum < target) left++;
    else right--;
}
```

* **연습 문제**

    * [3273번 두 수의 합](https://www.acmicpc.net/problem/3273)

---

### 1-6. 자료구조

* 스택: `Stack<Integer> st = new Stack<>();`

* 큐: `Queue<Integer> q = new LinkedList<>();`

* 우선순위 큐: `PriorityQueue<Integer> pq = new PriorityQueue<>();`

* 맵/셋: `HashMap`, `HashSet`

* **연습 문제**

    * [1874번 스택 수열](https://www.acmicpc.net/problem/1874)
    * [2164번 카드2](https://www.acmicpc.net/problem/2164)
