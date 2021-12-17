#fibbonacci 
n1, n2 = -1,1
sum = 0
n = int(input("Number :"))
for i in range(n+1):
    sum = n1 + n2
    print(sum)
    n1,n2 = n2,sum #swap variable
    