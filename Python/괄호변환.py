def divide(p):
    openP = 0
    closeP = 0

    for i in range(len(p)):
        if p[i] == '(':
            openP += 1
        else:
            closeP += 1
        if openP == closeP:
            return p[:i+1],p[i+1:]
def isBalanced(u):
    stack = []
    
    for s in u:
        if s == "(":
            stack.append(s)
        else:
            if not stack:
                print(s)
                return False
            stack.pop()
    return True

def solution(p):
    answer = ''
    ## 과정1
    if not p:
        return ""
    ## 과정2 
    u,v = divide(p)
    print(u,v)

    ## 과정3
    if isBalanced(u):
        return u+solution(v)
    ## 과정4
    else:
        # 과정 4-1
        answer = '('
        # 과정 4-2
        answer += solution(v)
        # 과정 4-3
        answer += ')'

        # 과정 4-4
        for p in u[1:len(u) -1]:
            if p == '(':
                answer += ')'
            else:
                answer += '('

    return answer



def divide2(p):
    openP = 0
    closeP = 0

    for i in range(len(p)):
        if p[i] == '(':
            openP += 1
        else:
            closeP += 1
        print(openP, closeP)

        if openP == closeP:
            return p[:i+1],p[i+1:]

print(solution("(()())()"))