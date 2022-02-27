test_list = [(5, 6, 7), (7, 2, 4, 6), (6, 6, 7), (6, 10, 8)]
  
print("The original list is : " + str(test_list))
  
N = 6
  
res = [tuple(ele for ele in sub if ele != N) for sub in test_list]

print("The Tuple List after removal of element : " + str(res))