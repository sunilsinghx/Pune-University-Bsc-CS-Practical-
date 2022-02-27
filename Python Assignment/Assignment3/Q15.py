def Convert(arr) :
    Tuple = ();

    Tuple = tuple(arr);

    return Tuple;

def main() :
    print("Jay Ganesh....");
    print("Enter Number of Element You Want in list....");
    No = int(input());
    arr = [];
    ret = ();
    for i in range(No) :
        print("Enter Eelement Number",i+1);
        arr.append(int(input()));   

    ret = Convert(arr);
    print(type(ret));
    print(ret);
    
if __name__ == "__main__" :
    main()