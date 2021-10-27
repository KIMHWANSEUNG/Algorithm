
##Lv1 3진법 뒤집기
def solution(n):
    answer = ''
    while n>0:
        ##나머지
        answer+=str(n%3)
        ##몫
        n=n//3
    return int(answer,3)

print(solution(45))