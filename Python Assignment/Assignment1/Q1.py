####################################################################
##
## Author : Pakshal Jain 
## Date : 5/2/2022
## Program : Write A Program To Caluculate Area of Triangle 
## 
####################################################################

def AreaOfTriangle(height,base) :
    Area = 0;

    Area = height * base // 2;

    return Area;

###############################################################################

def main() :
    height = 0;
    base = 0;
    ret = 0;

    print("Jay Ganesh...");
    print("Enter Height of Triangle : ");
    height = int(input());

    print("Enter Base of Triangle : ");
    base = int(input());

    ret = AreaOfTriangle(height,base);

    print("Area of Triangle is :",ret);

if __name__ == "__main__" :
    main();