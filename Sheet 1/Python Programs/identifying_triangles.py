a = int(input("Enter the first angle of a trianle :"))
b = int(input("Enter the second angle of a trianle :"))
c = int(input("Enter the third angle of a trianle :"))
if (a + b + c == 180):
elif(a==90 or b==90 or c==90):
    print("This is a Right triangle")
elif(a<90 or b<90 or c<90):
    print("This is a Acute triangle")
elif(a>90 or b>90 or c>90):
    print("This is a Obtuse triangle")
else:
    print("Not  a triangle")