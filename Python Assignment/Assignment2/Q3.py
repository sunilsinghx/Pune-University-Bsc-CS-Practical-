def Remove(Str,No) :
    arr = [];
    arr = list(Str);
    String = "";
    for i in range(len(arr) - 1,-1,-1) :
        if i == No :
            arr[i] = "";

    String = String.join(arr);
    print(String);
def main() :
    
    print("Enter One String...");
    str = input();

    print("Enter One Index you to remove Character of...");
    No = int(input());

    Remove(str,No);
if __name__ == "__main__" :
    main();