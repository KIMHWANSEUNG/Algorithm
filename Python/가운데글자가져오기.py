def solution(s):
    s=list(s)
    if len(s)%2==1:
        return s[int(len(s)/2)]
    else:
        return s[int(len(s)/2)-1]+s[int((len(s)/2))]
  

print(solution("abcde"))
print(solution("qwer"))