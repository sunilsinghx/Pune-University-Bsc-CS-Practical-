def List(arr) :
    brr = [];

    for i in range(len(arr)) :
        if arr[i] not in brr :
            brr.append(arr[i]);
    
    return brr;
def main() :
    arr = [];
    ret = [];

    print("Enter Number of Elements You Want in List...");
    No = int(input());

    for i in range(No) :
        print("Enter Element Number : ",i+1);
        arr.append(int(input()));
    
    print("Entered Array...");
    print(arr);

    ret = List(arr);
    print("Unique Array is : ",ret);
if __name__ == "__main__": 
    main()