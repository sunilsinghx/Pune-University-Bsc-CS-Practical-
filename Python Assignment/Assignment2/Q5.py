def Summation(arr) :
    Sum = 0;

    for i in range(len(arr)) :
        Sum = Sum + arr[i];
    
    return Sum;

def main() :
    ret = 0;

    print("Enter Number of Elements You Want in List.....");
    No = int(input());
    arr = [];

    for i in range(No) :
        print("Enter Element Number : ",i + 1);
        arr.append(int(input()));
    
    print("Entered Elements : ");
    print(arr);

    ret = Summation(arr);
    print("Summation of Entered Array is : ",ret);

if __name__ == "__main__" :
    main();