def solution(number, k):
    stk=[]
    
    for i in number:
        while stk and stk[-1]<i and k>0:
            k-=1
            stk.pop()
        stk.append(i)
        print(len(stk))
    return "".join(stk[:len(stk)-k])


#"94"
print(solution("1924",2))


























def solution2(number, k):
    stack = [number[0]]
    for num in number[1:]:
        while len(stack) > 0 and stack[-1] < num and k > 0:
            k -= 1
            stack.pop()
        stack.append(num)
    if k != 0:
        stack = stack[:-k]
    return ''.join(stack)