arr = list(map(int, input().split()))
check = 0
for i in range(0, 5):
    check += arr[i] * arr[i]
check %= 10
print(check)