public class DFS_EX1 {
    public static int solution(int[] numbers, int target) {
        return dfs(numbers,target,0,0);
    }
    public static int dfs(int[] numbers, int target, int depth, int sum){
        int resultCnt = 0;

        if(depth == numbers.length){
            if(sum == target){
                return 1;
            }
            return 0;
        }

        resultCnt += dfs(numbers, target, depth+1, sum+numbers[depth]) + dfs(numbers, target, depth+1, sum-numbers[depth]);
    

        return resultCnt;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};

        System.out.println(solution(arr,3));
    }
}
