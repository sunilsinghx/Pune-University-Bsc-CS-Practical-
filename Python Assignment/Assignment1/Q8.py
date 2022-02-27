def Factorial(No) :
    Mult = 1;

    for i in range(No,0,-1) :
        Mult = Mult * i;

    return Mult;

def main() :
    ret = 0;

    print("Jay Ganesh....");
    print("Enter One Number....");
    No = int(input());

    ret = Factorial(No);
    print("Factorial of Number is :",ret);

if __name__ == "__main__" :
    main();