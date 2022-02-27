def Count(Str,Str2) :
    icnt = 0;
    for i in range(len(Str)) :
        for j in range(len(Str2)) :
            if Str[i] == Str2[j] :
                icnt = icnt + 1    
    return icnt;

def main() :
    ret = 0;

    print("Enter One String...");
    Str = input();
    print("Enter Second String...");
    Str2 = input();

    ret = Count(Str,Str2);
    print("Count Of Matching Characters is : ",ret);
if __name__ == "__main__" :
    main();