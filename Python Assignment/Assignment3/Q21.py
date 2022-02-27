from operator import length_hint


def Length(sets):
    return len(sets);
      
sets = set([8, 16, 24, 1, 25, 3, 10, 65, 55])

ret = Length(sets);

print("Length of Set is : ",ret);