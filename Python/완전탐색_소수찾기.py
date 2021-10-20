import math

number_set = set()
##순열 
def permutation(base,numbers):
    if base :
        ##print(base)
        number_set.add(int(base))
    print(numbers)
    for i,s in enumerate(numbers):
        permutation(base+s,numbers[:i]+numbers[i+1:])
## 소수 검열
def check_prime(n):
    if n<2:
        return False
    if n == 2:
        return True
    
    for i in range(2,int(math.sqrt(n))+1):
        if(n%i) == 0:
            return False
    return True

def solution(numbers):
    answer = 0
    ##순열조회 
    permutation("",numbers)
    
    ##소수 검열
    answer = len(list(filter(check_prime,number_set)))

    return answer
##ls = ['1','2','3','4']
##print(ls[2:])

print(solution("011"))

