import heapq

def solution(scoville,K):
    answer=0
    heapq.heapify(scoville)
    while True:
        first=heapq.heappop(scoville)
        if first>K:
            break
        if len(scoville)==0:
            return -1
        second=heapq.heappop(scoville)
        heapq.heappush(scoville,first+second*2)
        answer+=1
        
    return answer




def solution2(scoville, K):
    answer = 0
    minscovile=min(scoville)

    while True:
        scoville.sort()
        scoville[0]=scoville[0]+(scoville[1]*2)
        scoville.pop(1)
        answer+=1
        
        
    return answer

print(solution([1, 2, 3, 9, 10, 12],7))