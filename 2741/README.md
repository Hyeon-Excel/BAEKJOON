# 📘 백준 2741번: N 찍기

## 📝 문제 설명
자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 문제입니다.

[🔗 문제 링크](https://www.acmicpc.net/problem/2741)

---

## 📥 입력
- 첫째 줄에 N이 주어진다. (1 ≤ N ≤ 100,000)

## 📤 출력
- 1부터 N까지 한 줄에 하나씩 출력한다.

---

## 💡 풀이 전략
- 반복문을 사용하여 1부터 N까지 순차적으로 숫자를 출력하면 됩니다.
- 매우 단순한 출력 문제로, 반복문과 기본 입출력에 익숙해지기 위한 연습 문제입니다.

---

## 💻 언어별 접근 방식

### ✅ C
- `scanf`로 N을 입력받고, `for` 반복문과 `printf`로 1부터 N까지 출력

> 📌 사용 함수: `scanf`, `printf`, `for`

---

### ✅ C++
- `cin`으로 입력받고, `printf` 또는 `cout`으로 출력  
- 반복문 구조는 C와 유사

> 📌 사용 요소: `cin`, `printf`, `for`, `iostream`

---

### ✅ Java
- `BufferedReader`로 정수 N을 입력받고, `for` 반복문으로 출력

> 📌 사용 클래스: `BufferedReader`, `System.out`

---

### ✅ Python
- `input()`으로 입력받고, `range(1, N+1)`을 통해 반복 출력

> 📌 사용 함수: `input`, `print`, `range`, `for`