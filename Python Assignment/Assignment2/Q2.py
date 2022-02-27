def Reverse(arr) :
    for i in range(len(arr)) : 
        for j in range(len(arr[i])) :
            for k in range(len(arr[i][j])-1,-1,-1) :
                print(arr[i][j][k],end = "");
            print(end = " ");
def main() :
    arr = []
    print("Enter One String To Reverse....");
    str = input();
    Str = str.split(" ");

    arr.append(Str);

    Reverse(arr);
    
if __name__ == "__main__" :
    main();