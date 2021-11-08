#Lv2
def solution(phone_book):
    answer = True
    phone_book= sorted(phone_book)
    print(phone_book)
    for i in range(len(phone_book)-1):
        if len(phone_book[i])<len(phone_book[i+1]):
            if phone_book[i+1][:len(phone_book[i])] == phone_book[i]:
                answer = False
                break
    return answer

print(solution(["119", "97674223", "1195524421"]))