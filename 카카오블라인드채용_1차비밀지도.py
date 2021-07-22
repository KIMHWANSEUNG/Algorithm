def solution(n, arr1, arr2):
    answer = []

    
    for a1,a2 in zip(arr1,arr2):
        arr12=str(bin(a1|a2))[2:]
        print(arr12)
        arr12[1].count(0)
    return answer

solution(5,[9, 20, 28, 18, 11],	[30, 1, 21, 17, 28])