def Tuple(arr,Element) :
    Tuple = ();

    Tuple = tuple(arr);
    if Element in Tuple :
        return True;
    else :
        return False;

def main() :
    arr = [];
    bret = False;

    print("Enter Number of ELement You want in List");
    No = int(input());

    print("Enter Element in Array")
    for i in range(No) :
        print("Enter Element Number",i + 1);
        arr.append(int(input()));
    
    print("Enter One ELement You Want To Check");
    value = int(input());

    bret = Tuple(arr,value);
    if bret == True :
        print("Element is Present in Tuple");
    else :
        print("Element is Not Present in Tuple");
if __name__ == "__main__" :
    main()