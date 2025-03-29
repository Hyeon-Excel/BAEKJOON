# 📘 백준 1000번: A + B

## 📝 문제 설명
두 정수 A와 B를 입력받은 다음, A + B를 출력하는 문제입니다.

[🔗 문제 링크](https://www.acmicpc.net/problem/1000)

---

## 📥 입력
- 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10,000)

## 📤 출력
- A + B를 출력한다.

---

## 💡 풀이 전략
- 입력으로 주어지는 공백 구분 두 수를 정수로 받아 더한 값을 출력하는 간단한 문제

---

## 💻 언어별 접근 방식

### ✅ C
- `scanf`를 사용해 두 정수를 입력받고, `printf`로 출력
- 문자열 파싱이 필요 없고, 입력을 정수로 직접 받는 **가장 절차적인 방식**
- 매우 빠르며, 저수준 접근이 필요한 상황에 적합

> 📌 사용 함수: `scanf`, `printf`

---

### ✅ C++
- `cin`, `cout`으로 입력과 출력을 처리
- C와 비슷하게 직접 정수로 입력받지만, **스트림 기반**으로 더 고수준
- `std::ios_base::sync_with_stdio(false)` 등을 활용하면 속도 최적화 가능

> 📌 사용 요소: `cin`, `cout`, `iostream`

---

### ✅ Java
- `BufferedReader`로 한 줄 전체를 문자열로 입력받은 후, `StringTokenizer`로 공백 기준 분리
- 문자열을 정수로 바꾸기 위해 `Integer.parseInt()` 사용
- **명시적 파싱과 클래스 사용이 필수적**이라 코드가 상대적으로 길어짐

> 📌 사용 클래스: `BufferedReader`, `StringTokenizer`, `Integer.parseInt`

---

### ✅ Python
- `input().split()`으로 입력 문자열을 공백 기준으로 나눈 뒤, `map(int, …)`으로 정수화
- **한 줄로 매우 간단하게 해결 가능**
- 언어 특성상 파싱과 타입 변환이 매우 직관적

> 📌 사용 함수: `input`, `split`, `map`