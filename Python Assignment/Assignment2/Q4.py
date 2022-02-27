def Maximum(arr) :
    Max = arr[0];
    for i in range(len(arr)) :
        if arr[i] > Max :
            Max = arr[i];
    
    return Max;
def main() :
    ret = 0;

    print("Enter Any Three Numbers");
    arr = [];
    for i in range(3) :
        print("Enter Element Number ",i + 1);
        arr.append(int(input()));
    
    ret = Maximum(arr);
    print("Maximum Number from Three Number is : ",ret);
    
if __name__ == "__main__" :
    main();