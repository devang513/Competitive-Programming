# Q9: Sum of digits of N
n = int(input("Enter N: "))
n = abs(n)
s = 0
while n != 0:
    d = n % 10
    s = s + d
    n = n // 10
print("Sum of digits =", s)
