# reverse input number

n = int(input("Number:"))
rev = 0
while n> 0:
    r = n %10
    rev = rev*10 + r
    n = n//10

print("Reverse : ",rev)
