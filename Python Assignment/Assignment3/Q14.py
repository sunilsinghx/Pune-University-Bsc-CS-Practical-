def Remove(arr) :
    if len(arr) == 0 :
        return True;
    else :
        return False;
   
def main() :
    print("Enter Number of Element You Want in list....");
    No = int(input());
    arr = [];
    bret = False;

    for i in range(No) :
        print("Enter Eelement Number",i+1);
        arr.append(int(input()));

    bret = Remove(arr); 
    if bret == True :
        print("List is Empty");
    else :
        print("List is Not Empty");
    
if __name__ == "__main__" :
    main()