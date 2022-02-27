def Perfect(No) :
    Sum = 0;
    if No < 0 :
        No = -No;

    for i in range(1,No) :
        if No % i == 0 :
            Sum = Sum + i;
    
    if Sum == No :
        return True;
    else :
        return False;
def main() :
    bret = False;

    print("Enter One Number To Check Whether Number is Perfect or Not");
    No = int(input());

    bret = Perfect(No);

    if bret == True :
        print("Number is Perfect..");
    else :
        print("Number is Not Perfect");

if __name__ == "__main__" :
    main();