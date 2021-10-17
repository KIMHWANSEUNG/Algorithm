##프로그래머스 Lv2 문제

def isPrime(number):
    if number == 0:
        return False
    elif number == 1: 
        return False
    else :
        for i in (0,number):
            if number % i !=0 :
                return False
            else :
                return True
                
def solution(numbers):
    answer = 0
    for i in range(0,len(numbers)):
        print(i)
    numbers = list(map(int,numbers))
    
    return numbers



print(solution("011"))

