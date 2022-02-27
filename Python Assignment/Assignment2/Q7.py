def EvenLength(arr) :
    print("\nEven Length String Are...");
    for i in range(len(arr)) : 
        for j in range(len(arr[i])) :
            if (len(arr[i][j]) % 2 == 0) :
                print(arr[i][j]);
def main() :
    arr = []
    print("Enter One String To");
    str = input();
    Str = str.split(" ");

    arr.append(Str);

    EvenLength(arr);
    
if __name__ == "__main__" :
    main();