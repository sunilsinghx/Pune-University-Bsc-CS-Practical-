def FibNo(No) :
    Sum = 0 ;
    value = 0;
    value2 = 1;

    print(value,value2,end = " ");
    for i in range(No) :
        Sum = value + value2;
        print(Sum,end = " ");
        value = value2;
        value2 = Sum;

def main() :
    print("Jay Ganesh.....");

    print("Enter One Number Till You Want Fibnoacii Series.");
    value = int(input());

    FibNo(value);
if __name__ == "__main__" :
    main();