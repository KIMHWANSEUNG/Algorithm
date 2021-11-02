##Lv1

def solution(numbers):
    answer=0
    for i in range(0,10):
        flag = 0
        for j in numbers :
            if i == j :
                flag+=1
        
        if flag == 0 : 
            answer+=i

    return answer

print(solution([5,8,4,0,6,7,9]))