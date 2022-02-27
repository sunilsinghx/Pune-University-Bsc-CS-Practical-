def CtoF(No) :
    cTof = 0;

    cTof = (No * (9 / 5)) + 32;

    return cTof;

def main() :
    print("Jay Ganesh...");

    ret = 0;
    print("Enter Temperature in Celcius...");
    No = int(input());

    ret = CtoF(No);

    print("Temperature Converted From Celcius To Fahrenheit is : ",ret);

if __name__ == "__main__" :
    main();