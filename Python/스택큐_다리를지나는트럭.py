import collections 

def solution(bridge_length, weight, truck_weights):
    time = 0
    on_weight=0
    on_bridge=collections.deque([0]*bridge_length)
    print(on_bridge)
    truck_weights=collections.deque(t for t in truck_weights)
    while truck_weights:
        time+=1
        on_weight=on_bridge.popleft
        print(on_weight) 
    return time

print(solution(2,10,[7,4,5,6]))

def solution(bridge_length, weight, truck_weights):
    """ 
    - param bridge_lengths : 다리 길이 (int)
    - param weight : 다리가 견딜 수 있는 무게 (int)
    - param truck_weights : 트럭별 무게 (list)
    - return : 모든 트럭이 다리를 건너는 시간 (int)
    """
    import collections
    
    time = 0
    on_weight = 0
    on_bridge = collections.deque([0] * bridge_length)
    truck_weights = collections.deque(t for t in truck_weights)
    

    while truck_weights : 
        time += 1
        
        on_weight -= on_bridge.popleft()
        if (on_weight + truck_weights[0]) <= weight : 
            truck = truck_weights.popleft()
            on_weight += truck
            on_bridge.append(truck)            
        else : 
            on_bridge.append(0)
        
    return time + bridge_length