a = int(input("Enter A: "))
s = 0
for i in range(1, a+1):
    if i % 2 != 0:
        s = s + i
print("Sum of odds =", s)
