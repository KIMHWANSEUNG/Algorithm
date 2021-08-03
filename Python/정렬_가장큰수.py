def solution(numbers):
    numbers=list(map(str,numbers))
    numbers.sort(key=lambda x:x*3,reverse=True)
    return "".join(numbers)


#출력: "6210"
print(solution([6, 10, 2]))
