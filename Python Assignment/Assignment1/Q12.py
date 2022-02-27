def PrimeNumbers(Value) :
    for num in range(1,Value + 1):
        if num > 1:
            for i in range(2, num):
                if (num % i) == 0:
                    break;
            else:
                print(num,end = " ");

def main() :
    print("Jay Ganesh....");

    print("Enter Number Till You Want All Prime Numbers");
    Value = int(input());

    PrimeNumbers(Value);
if __name__ == "__main__" :
    main();