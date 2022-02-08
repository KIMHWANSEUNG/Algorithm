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