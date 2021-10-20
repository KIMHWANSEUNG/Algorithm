def solution(price, money, count):
    answer = 0
    price_total = 0
    for i in range(1,count+1):
        price_total+=price*i
    answer =price_total - money

    if answer<0 :
        answer = 0
        
    return answer

print(solution(3,20,4))
print('test')