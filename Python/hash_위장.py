#https://programmers.co.kr/learn/courses/30/lessons/42578
from collections import defaultdict
#defaultdict은 dict의 setdefault를 사용해 키값을 미리 설정하지 않고 키 값을 넣고 value값을 동시에 같이 넣을수 있는 구조로 만들어준다.

def solution(clothes):
    answer = 1
    clothes_dic=defaultdict(list)
    


    for sample, category in clothes:
        clothes_dic[category].append(sample)
    
    for i in clothes_dic.keys():
        print(clothes_dic[i])
        answer *= len(clothes_dic[i])+1
        print(answer)
    
    answer-=1
    return answer

print(solution([["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]]))

