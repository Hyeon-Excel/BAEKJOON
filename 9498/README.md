# 📘 백준 9498번: 시험 성적

## 📝 문제 설명
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지는 F를 출력하는 문제입니다.

[🔗 문제 링크](https://www.acmicpc.net/problem/9498)

---

## 📥 입력
- 시험 점수 `score`가 정수로 주어진다. (0 ≤ score ≤ 100)

## 📤 출력
- 점수에 따라 등급을 출력한다.

---

## 💡 풀이 전략
- 단순한 **조건문(if-else)**을 사용해 점수 구간에 따라 등급을 출력합니다.
- 점수 조건은 위에서부터 차례대로 검사하면 되므로 순서가 중요합니다.
- **범위 조건 설정에 유의**하면서 분기 처리하는 기본적인 분기 문제입니다.

---

## 💻 언어별 접근 방식

### ✅ C
- `scanf`로 점수를 입력받고, `if-else if`로 구간 조건을 검사해 `printf`로 출력

> 📌 사용 함수: `scanf`, `printf`, `if`, `else if`, `else`

---

### ✅ C++
- `cin`으로 입력, `cout`으로 출력
- 조건문으로 점수에 따라 문자 출력

> 📌 사용 요소: `cin`, `cout`, `if`, `else if`, `iostream`

---

### ✅ Java
- `BufferedReader`로 입력받고 `Integer.parseInt`로 변환
- `if-else` 조건문으로 출력

> 📌 사용 클래스: `BufferedReader`, `Integer.parseInt`, `System.out`

---

### ✅ Python
- `input()`으로 점수 입력 후, `int()` 변환
- `if-elif-else` 조건문으로 등급 출력

> 📌 사용 함수: `input`, `print`, `if`, `elif`, `else`
