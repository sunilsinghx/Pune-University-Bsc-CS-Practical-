def Sets(arr) :
    Set = {};

    Set = set(arr);
    
    for i in Set :
        print(i,end = " ");

def main() :
    arr = [];

    print("Enter Number of ELement You want in List");
    No = int(input());

    print("Enter Element in Array")
    for i in range(No) :
        print("Enter Element Number",i + 1);
        arr.append(int(input()));
    
    Sets(arr);
    #print(type(ret));
    #print(ret);

if __name__ == "__main__" :
    main()