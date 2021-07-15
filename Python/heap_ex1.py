def solution(scoville, K):
    answer = 0
    minscovile=min(scoville)

    while True:
        scoville.sort()
        scoville[0]=scoville[0]+(scoville[1]*2)
        scoville.pop(1)
        answer+=1
        
        
    return answer

print(solution([1, 2, 3, 9, 10, 12],7))