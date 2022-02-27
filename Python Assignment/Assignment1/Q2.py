#############################################################################
##
## Author : Pakshal Jain
## Date : 5/02/2022
## Program : Write A Program To Swap Two Variables  
##
#############################################################################
def Swap(No,No2) :
    value = No;
    value2 = No2;

    value,value2 = value2,value;

    return value,value2;

###########################################################################################

def main() :
    print("Jay Ganesh...");
    No = 0;
    No2 = 0;
    ret = 0;
    ret2 = 0;

    print("Enter First Number : ");
    No = int(input());

    print("Enter Second Number : ");
    No2 = int(input());

    print("Value Before Swapping : ",No,No2);

    ret,ret2 = Swap(No,No2);

    print("Value After Swapping : ",ret,ret2);

if __name__ == "__main__" :
    main();