
##lv2
## 카카오 블라인 2018 
from collections import Counter

def solution(str1, str2):
    str1_low = list(str1.lower())
    str2_low = list(str2.lower())

    str1_ls=[]
    str2_ls=[]

    for i in range(0,len(str1_low)-1):
        if str1_low[i].isalpha() and str1_low[i+1].isalpha():
            str1_ls.append(str1_low[i]+str1_low[i+1])

    for i in range(0,len(str2_low)-1):
        if str2_low[i].isalpha() and str2_low[i+1].isalpha():
            str2_ls.append(str2_low[i]+str2_low[i+1])

    counter1=Counter(str1_ls)
    counter2=Counter(str2_ls)

    inner = len(list((counter1 & counter2).elements()))
    union = len(list((counter1 |  counter2).elements()))

    print(inner)
    print(union)

    if inner == 0 and union == 0 :
        return 65536

    answer= int((inner/union)*65536)

   
    return answer

## result: 16384
print(solution("FRANCE","french"))