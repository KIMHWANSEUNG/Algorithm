### 몫과 나머지 
### 내가 푼 코드
print("------------------------------------------------")
print("몫과 나머지 ")
a = 7
b = 5
print(a//b, a%b)

a = 7
b = 5
print(*divmod(a, b))

print("------------------------------------------------")
print("n진법으로 표기된 string을 10진법 숫자로 변환하기")
num, base = 12, 3

output = 0
for idx,val in enumerate(str(num)[::-1]):
    output+=(base**idx)*int(val)
print(output)

num = '12'
base = 3
answer = int(num, base)
print(answer)

print("------------------------------------------------")
print("문자열 정렬")
s, n = 'abc',7
if len(s) < n and (n-len(s))%2==0:
    print(s.ljust(n))
    print(s.center(n))
    print(s.rjust(n))

print("------------------------------------------------")
print("알파벳출력")
alpabet='abcdef'
if num == 0:
    print(alpabet.lower())
else:
    print(alpabet.upper())

print("------------------------------------------------")
print("2차원 뒤집기")
def solution(mylist):
    answer = []
    for size in range(0,len(mylist[0])):
        arr_list=[]
        for arr in mylist:
            arr_list.append(arr[size])
        answer.append(arr_list)
    return answer
print(solution([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))

## map, zip 사용 
def solution2(mylist):
 answer = list(map(list,zip(*mylist)))
 return answer
print(solution2([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))
