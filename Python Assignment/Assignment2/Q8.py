def Check(Str) :
    for i in range(len(Str)) :
        if(Str[i] == 'a' or Str[i] == 'e' or Str[i] == 'i' or Str[i] == 'o' or Str[i] == 'u' or Str[i] == 'A' or Str[i] == 'E' or Str[i] == 'I' or Str[i] == 'O' or Str[i] == 'U') :
            continue;
        else :
            break;

    if(Str[i] == 'a' or Str[i] == 'e' or Str[i] == 'i' or Str[i] == 'o' or Str[i] == 'u'or Str[i] == 'A' or Str[i] == 'E' or Str[i] == 'I' or Str[i] == 'O' or Str[i] == 'U') :
        return True;
    else :
        return False;
def main() :
    print("Enter one String...");
    bret = False;

    Str = input();
    bret = Check(Str);

    if bret == True :
        print("String Accepted");
    else :
        print("String Not Accepted");
if __name__ == "__main__" :
    main();