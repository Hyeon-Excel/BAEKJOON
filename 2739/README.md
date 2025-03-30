# 📘 백준 2739번: 구구단

## 📝 문제 설명
N을 입력받은 뒤, 출력 형식에 맞춰 N단 구구단을 출력하는 문제입니다.

[🔗 문제 링크](https://www.acmicpc.net/problem/2739)

---

## 📥 입력
- 첫째 줄에 N이 주어진다. (1 ≤ N ≤ 9)

## 📤 출력
- 출력 형식에 맞춰 `N * i = result` 형식으로 1부터 9까지 출력한다.

---

## 💡 풀이 전략
- 1부터 9까지 반복문을 사용하여 N과 i의 곱을 계산하고, 지정된 출력 형식대로 출력하면 됩니다.
- 문자열 포맷팅 또는 출력 함수에서 직접 `N * i = result` 형식을 만들어주면 됩니다.
- 반복문과 출력 형식을 연습하기에 적합한 초급 문제입니다.

---

## 💻 언어별 접근 방식

### ✅ C
- `scanf`로 정수 N을 입력받고, `for` 반복문으로 1~9까지 곱셈 수행
- `printf`를 사용해 형식대로 출력

> 📌 사용 함수: `scanf`, `printf`, `for`

---

### ✅ C++
- `cin`으로 입력받고, `cout`으로 출력 형식 구성
- `endl`로 줄바꿈 처리

> 📌 사용 요소: `cin`, `cout`, `for`, `iostream`

---

### ✅ Java
- `BufferedReader`로 입력, `System.out.println`으로 출력
- 문자열 연결을 통해 `N * i = result` 형식 구성

> 📌 사용 클래스: `BufferedReader`, `System.out`

---

### ✅ Python
- `input()`으로 정수 입력, `for` 반복문으로 구구단 출력
- `f-string` 또는 `format()`을 사용해 출력 형식 구성

> 📌 사용 함수: `input`, `print`, `for`, `f-string`