def Sort_Tuple(tup):   
    list = len(tup)  
    for i in range(0, list):  
        for j in range(0, list-i-1):  
            if (tup[j][-1] > tup[j + 1][-1]):  
                temp = tup[j]  
                tup[j]= tup[j + 1]  
                tup[j + 1]= temp  
    return tup;
     
tup =[(1, 3), (3, 2), (2, 1)]
          
print(Sort_Tuple(tup))