def solution(num):
    answer = 0
    num = list(map(int,str(num)))
    half_size = int(len(num)/2)

    front_tnt = 1
    back_tnt= 1
    
    ## front_tnt 약수 리스트
    front_measure = []
    
 
    ##앞쪽 곱 구하기 
    for a in range(0,half_size):
        front_tnt *=num[a]
    ##뒤쪽 곱의 구하기
    for b in range(half_size,len(num)):
        back_tnt*=num[b]
    ## front_tnt 의 약수 찾기
    for c in range(1,front_tnt+1):
        if front_tnt % c == 0:
            front_measure.append(c)
    
    for d in front_measure:
        print(d)
    
    

    print(front_measure)
    return answer

print(solution(235386))
