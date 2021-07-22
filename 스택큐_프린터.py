def solution(p,l):
    ans=0
    m=max(p)
    while True:
        v=p.pop(0)
        if m == v:
            ans+=1
            if l==0:
                break
            else:
                l-=1
        else:
            p.append(v)
            if l == 0:
                l=len(p)-1
            else:
                l-=1
    return ans

print(solution([2, 1, 3, 2],2))











def solution2(p, l):
    ans = 0
    m = max(p)
    while True:
        v = p.pop(0)
        print(v)
        if m == v:
            ans += 1
            if l == 0:
                break
            else:
                l -= 1
            m = max(p)
        else:
            p.append(v)
            if l == 0:
                l = len(p)-1
            else:
                l -= 1
    return ans


