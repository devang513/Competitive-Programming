# Q8: Count digits of N
n = int(input("Enter N: "))
count = 0
if n == 0:
    count = 1
else:
    while n != 0:
        count = count + 1
        n = n // 10
print("Digits =", count)
