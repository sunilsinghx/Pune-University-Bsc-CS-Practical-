def Check(No) :
    if No > 0 :
        print("Number is Positive..");
    elif No < 0 :
        print("Number is Negative...");
    elif No == 0 :
        print("Number is Zero...");
    else :
        print("Invalid Input...");

def main() :
    print("Jay Ganesh...");

    print("Enter one Number..");
    No = int(input());

    Check(No);
    
if __name__ == "__main__" :
    main();