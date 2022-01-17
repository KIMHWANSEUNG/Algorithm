def solution(id_list, report, k2):
    report = set(report)

    ##신고당한사람:[신고한사람들]
    singodang_dic= {string: [] for string in id_list}

    answer_dic = {string: 0 for string in id_list}
    for i in report:
       splt= i.split(" ",2)
       singodang_dic.get(splt[1]).append(splt[0])

    for k,v in singodang_dic.items():
        if len(v) >=k2:
            for i in v:
                answer_dic[i]+=1
        
    return list(answer_dic.values())

print(solution(["muzi", "frodo", "apeach", "neo"],["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"],2))