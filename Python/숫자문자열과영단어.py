#lv 1
## 문제 풀이 접근 방법부터 생각하자 !! 
def solution(s):
    answer = ''
    en = ['zero','one','two','three','four','five','six','seven','eight','nine']
    for idx,num in enumerate(en):
        if num in s:
            s=s.replace(num,str(idx))
        answer=s
    return int(answer)


print(solution("one4seveneight"))