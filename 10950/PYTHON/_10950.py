T = int(input())
arr = []

for i in range(0, T):
    A, B = map(int, input().split())
    arr.append(A + B) 
for i in range(0, T):
    print(arr[i])