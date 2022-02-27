def KMtoM(No) :
    kmTom = 0;
    value = 0.621371;
    kmTom = No * value;

    return kmTom;
def main() :
    print("Jay Ganesh....");
    ret = 0;

    print("Enter Kilometer To COnvert into Miles..");
    No = int(input());

    ret = KMtoM(No);

    print("Km Converted into Mile is : ",ret);
    
if __name__ == "__main__" :
    main();