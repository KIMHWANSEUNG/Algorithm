import itertools


def solution(orders, course):
    answer = []
    ## 가장 많이 시킨 코스요리 찾기
    for size_of_course in course:
        order_dict= {}
        order_combinations = []
        for order in orders:
            print(list(itertools.combinations(sorted(order),size_of_course)))
            order_combinations.extend(list(itertools.combinations(sorted(order),size_of_course)))

        for order_combination in order_combinations:
            print(order_combination)
            order_str = ''.join(order_combination)
            if order_str in order_dict :
                order_dict[order_str]+=1
            else:
                order_dict[order_str] = 1
        print(order_dict)  

        for k,v in order_dict.items():
            if order_dict[k] == max([order_dict[order] for order in order_dict]):
                if order_dict[k] > 1:
                    answer.append(k)

    return sorted(answer)

print(solution(["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"],[2,3,4]))