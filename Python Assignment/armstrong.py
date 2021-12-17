# if input no is armstrong number

sum = 0
n = int(input("Number:"))
temp = n

while temp > 0:
    digit = temp%10
    sum += digit**3
    temp //= 10

if(n == sum):
    print(f"{n} is Armstrong Number")
else:
    print(f"{n} is Not Armstrong Number")