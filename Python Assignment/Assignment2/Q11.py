def CheckPrime(No) :
    Sum = 0;

    if No < 0 :
        No = -No;

    for i in range(1,No) :
        if No % i == 0 :
            Sum = Sum + i;

    if Sum == 1 :
        return True;
    else :
        return False;
def main() :
    bret = False;
    print("Enter One Number....");
    No = int(input());

    bret = CheckPrime(No);
    if bret == True :
        print("Entered Number is Prime Number..");
    else :
        print("Enterd Number is Not A Prime Number..");

if __name__ == "__main__" :
    main();