def Remove(arr) :
    brr = [];

    for i in range(len(arr)) :
        if arr[i] not in brr :
            brr.append(arr[i]);

    return brr;

def main() :
    print("Enter Number of Element You Want in list....");
    No = int(input());
    arr = [];
    ret = [];

    for i in range(No) :
        print("Enter Eelement Number",i+1);
        arr.append(int(input()));

    ret = Remove(arr); 

    print("Array After  Duplicate ELement Rmoved... : ",ret);
    
if __name__ == "__main__" :
    main()