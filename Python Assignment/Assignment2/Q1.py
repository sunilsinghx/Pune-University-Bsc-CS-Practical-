def CheckSymmetric(str) :
    arr = [];
    brr = [];

    if len(str) % 2 == 0 :
        for i in range(len(str) // 2) :
            arr.append(str[i]);
        for j in range(len(str) // 2,len(str)) :
            brr.append(str[j]);
        
        if arr == brr :
            return True;
        else :
            return False;
    else :
        for i in range(len(str) // 2) :
            arr.append(str[i]);
        for j in range(len(str) // 2 + 1,len(str)) :
            brr.append(str[j]);
        
        if arr == brr :
            return True;
        else :
            return False;

def Pallindrome(str) :
    arr = [];
    brr = [];

    if len(str) % 2 == 0 :
        for i in range(len(str) // 2) :
            if(str[i] >= 'A' and str[i] <= 'Z') :
                ascci = ord(str[i]);
                ascci = ascci + 32;
                arr.append(chr(ascci));
            else :
                arr.append(str[i]);
        for j in range(len(str) - 1,len(str) // 2 - 1,-1) :
            if(str[j] >= 'A' and str[j] <= 'Z') :
                ascci = ord(str[j]);
                ascci = ascci + 32;
                brr.append(chr(ascci));
            else :
                brr.append(str[j]);
        
        if arr == brr :
            return True;
        else :
            return False;
    else :
        for i in range(len(str) // 2) :
            if(str[i] >= 'A' and str[i] <= 'Z') :
                ascci = ord(str[i]);
                ascci = ascci + 32;
                arr.append(chr(ascci));
            else :
                arr.append(str[i]);
        for j in range(len(str) - 1,len(str) // 2,-1) :
            if(str[j] >= 'A' and str[j] <= 'Z') :
                ascci = ord(str[j]);
                ascci = ascci + 32;
                brr.append(chr(ascci));
            else :
                brr.append(str[j]);
        
        if arr == brr :
            return True;
        else :
            return False;
def main() :
    print("Jay Ganesh...");
    bret = False;
    bret2 = False;

    print("Enter One String....");
    str = input();
    
    bret = CheckSymmetric(str);
    bret2 = Pallindrome(str);

    if bret == True :
        print("String is Symmetric..");
    else :
        print("String is Not Symmetric..");

    if bret2 == True :
        print("String is Pallindrome..");
    else :
        print("String is Not Pallindrome..");

if __name__ == "__main__" :
    main();