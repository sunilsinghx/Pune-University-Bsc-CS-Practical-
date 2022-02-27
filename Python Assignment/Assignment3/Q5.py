def Tuple(arr) :
    Tuple = ();

    Tuple = tuple(arr);

    return Tuple;
def main() :
    arr = [];
    ret = ();
    print("Enter Number of ELement You want in List");
    No = int(input());

    print("Enter Element in Array")
    for i in range(No) :
        print("Enter Element Number",i + 1);
        arr.append(input());
    
    ret = Tuple(arr);
    print(type(ret));
    print(ret);

if __name__ == "__main__" :
    main()