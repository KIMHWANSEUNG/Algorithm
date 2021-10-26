def solution(record):
    answer = []
    users = {}
    log = []
    for i in record:
        who=i.split(" ")
        uid = who[1]
        if who[0] == "Enter":
            users[uid] = who[2]
            log.append((uid,"E"))
        elif who[0] == "Leave":
            log.append((uid,"L"))
        elif who[0] == "Change":
            users[uid] = who[2]
            log.append((uid,"C"))
    for l in log :
        if l[1] == "E":
            answer.append(users[l[0]]+"님이 들어왔습니다.")
        elif l[1] == "L":
            answer.append(users[l[0]]+"님이 나갔습니다.")

    
    return answer


print(solution(["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]))