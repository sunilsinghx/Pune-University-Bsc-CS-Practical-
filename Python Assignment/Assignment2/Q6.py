def Reverse(Str) :
    for i in range(len(Str) - 1,-1,-1 ) :
        print(Str[i],end = "");

def main():
    
    print("Enter One String to Reverse..");
    Str = input();

    Reverse(Str);
if __name__ == "__main__" :
    main();