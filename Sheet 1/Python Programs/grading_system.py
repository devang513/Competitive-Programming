n = int(input("Enter the percentage of student : "))
if(n>85):
    print("Grade A+")
elif(n<=85 and n>65):
    print("Grade A")
elif(n<=65 and n>45):
    print("Grade B")
elif(n<=45 and n>25):
    print("Grade C")
else:
    print("Grade D")