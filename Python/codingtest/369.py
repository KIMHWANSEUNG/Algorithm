def solution(num):
    cnt = 0
    for i in range(1,num+1):
        s = str(i)
        for x in s:
            if (x=='3') or (x=='6') or (x=='9'):
                cnt+=1
                break
    return cnt

print(solution(33))