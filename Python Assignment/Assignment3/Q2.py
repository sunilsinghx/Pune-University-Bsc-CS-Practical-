def List(arr) :
    Mult = 1;

    for i in range(len(arr)) :
        Mult = Mult * arr[i];
    
    return Mult;

def main() :

    arr = [];
    ret = 0;

    print("Enter NUmber Of Elements You Want in List");
    No = int(input());

    print("Enter Element in List...");
    for i in range(No) :
        print("Enter Element Number",i + 1);
        arr.append(int(input()));
    
    print("Entered Element in list");
    print(arr);
    
    ret = List(arr);
    print("Multiple of All Elements From List is : ",ret);

    
if __name__ == "__main__" :
    main();