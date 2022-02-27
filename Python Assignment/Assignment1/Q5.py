def CheckEvenOrODD(No) :
    if No < 0 :
        No = -No;

    if No % 2 == 0 :
        return True;
    else :
        return False;

def main() :
    bret = False;

    print("Jay Ganesh....");
    
    print("Enter One Number...");
    No = int(input());

    bret = CheckEvenOrODD(No);

    if bret == True :
        print("Entered Number is Even..");
    else :
        print("Entered Number is ODD...");
if __name__ == "__main__" :
    main();