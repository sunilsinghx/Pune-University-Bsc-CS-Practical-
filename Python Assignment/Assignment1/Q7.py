def CheckArmstrong(No) :
    Digits = 0;
    no = No;
    Sum = 0;
    while no != 0 :
        Digits = no % 10 ;
        Sum = Sum + Digits**3;
        no = no // 10;
    
    if Sum == No :
        return True;
    else :
        return False;

def main() :
    bret = False;
    print("Jay Ganesh...");

    print("Enter One Number....");
    No = int(input());

    bret = CheckArmstrong(No);

    if bret == True :
        print("Entered Number is Armstrong Number....");
    else :
        print("Entered Number is Not An Armstrong Number....");
        
if __name__ == "__main__" :
    main();