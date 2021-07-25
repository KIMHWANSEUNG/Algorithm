import re
def solution(new_id):
    answer = new_id.lower()
    answer= re.sub('[^a-z0-9\-_.]','',answer)
    answer=re.sub('\.+','.',answer)
    answer=re.sub('^[.]|[.]$','',answer)
    answer= 'a' if len(answer) ==0 else answer[:15]
    answer=re.sub('^[.]|[.]$','',answer)
    answer= answer if len(answer)>2 else answer + "".join(answer[-1] for i in range(3-len(answer)))

    answer 

    return answer

print(solution("...!@BaT#*..y.abcdefghijklm."))
print(solution(""))


import re

def solution2(new_id):
    st = new_id
    st = st.lower()
    st = re.sub('[^a-z0-9\-_.]', '', st)
    st = re.sub('\.+', '.', st)
    st = re.sub('^[.]|[.]$', '', st)
    st = 'a' if len(st) == 0 else st[:15]
    st = re.sub('^[.]|[.]$', '', st)
    st = st if len(st) > 2 else st + "".join([st[-1] for i in range(3-len(st))])
    return st