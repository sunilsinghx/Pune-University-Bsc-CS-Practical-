def LeapYear(Value) :
    if Value % 400 == 0:
        return True;
    elif Value % 100 == 0:
        return False;
    
    if Value % 4 == 0:
        return True;
    else :
        return False;
def main() :
    print("Jay Ganesh....");
    bret = False;

    print("Enter Year...");
    No = int(input());

    bret = LeapYear(No)
    if bret == True :
        print("Entered Year is A leap Year..");
    else :
        print("Entered Year is Not A Leap Year...");
        
if __name__ == "__main__" :
    main();