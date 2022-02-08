import itertools


def solution(orders, course):
    answer = []

    for size_of_course in course:
        orders_dict = {}
        orders_combination = []
        for order in orders:
            orders_combination.extend(list(itertools.combinations(sorted(order),size_of_course)))
        print(orders_combination)

            

    
        
    return answer

print(solution(["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"],[2,3,4]))