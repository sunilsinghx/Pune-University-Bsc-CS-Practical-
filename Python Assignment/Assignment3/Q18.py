def Convert(arr) :
    Tuple = ();

    Tuple = tuple(arr);

    return len(Tuple);

def main() :
    print("Enter Number of Element You Want in list....");
    No = int(input());
    arr = [];
    ret = 0;
    for i in range(No) :
        print("Enter Eelement Number",i+1);
        arr.append(int(input()));   

    ret = Convert(arr);
    print("Length of Tuple is : ",ret);
    
if __name__ == "__main__" :
    main()