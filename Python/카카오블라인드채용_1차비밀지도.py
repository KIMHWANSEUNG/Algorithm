def solution(n, arr1, arr2):
    answer = []

    for a1,a2 in zip(arr1,arr2):
        arr12=str(bin(a1|a2))[2:]
        arr12 = arr12.rjust(n,'0')
        arr12=arr12.replace('1','#')
        arr12=arr12.replace('0',' ')
        answer.append(arr12)
    print(answer)        
    return answer

solution(5,[9, 20, 28, 18, 11],	[30, 1, 21, 17, 28])
solution(6,[46, 33, 33 ,22, 31, 50],[27 ,56, 19, 14, 14, 10])
