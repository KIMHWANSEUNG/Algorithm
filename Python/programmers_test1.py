def solution(a, b):
    var=[]
    answer = 0

    var.append(a)
    var.append(b)  

    for i in range(min(var),max(var)+1):
        answer+=i
    return answer


print(solution(3,5))