/*
**Problem Description**  
Samantha is a teacher who is teaching a group of students about divisibility by 7. To make the lesson more interesting, she gives them an array **A** of size **N** and asks them **Q** queries given by **B**.
In each query, she gives them a range from **L** to **R** given by **B[i][0]** and **B[i][1]** and asks them to find the count of numbers divisible by 7 in subarray **A[L], A[L+1], ... A[R]**. Since some students are struggling to solve the problem, Samantha asks for your help to come up with a solution.

**Constraints**  
- (1 <= N <= 10^5)  
- (1 <= Q <=10^5)  
- (1 <=leq A[i] <=leq 10^9)  
- (0 <= B[i][0], B[i][1] < N)

**Input Format** 
- First argument **A** is an integer array.  
- Second argument **B** is a 2D integer array.

**Output Format**  
- Return an integer array where the ith index contains the count of numbers divisible by 7 in the range **A[B[i][0]]** to **A[B[i][1]]**.

**Example Input**  
Input 1:  
A = [2, 7, 14, 5, 7]  
B = [[0, 2], [2, 4]]

Input 2:  
A = [7, 14, 2, 14]  
B = [[1, 2], [0, 3]]

**Example Output**  
Output 1:  
[2, 2]

Output 2:  
[1, 3]
*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        // ans is a binary array: if the element in the array is divisible by 7, then ans will store 1, else 0 will be stored for an index
        for(int idx=0; idx<A.size(); idx++) {
            ans.add(A.get(idx)%7==0? 1 : 0);
        }
        
        // prefix sum array to keep the count of factors of 7 till ith index (since binary array adding 0 to the sum won't affect the results)
        for(int idx=1; idx<ans.size(); idx++) {
            int num = ans.get(idx-1)+ans.get(idx);
            ans.set(idx, num);
        }
        
        for(int idx=0; idx<B.size(); idx++) {
            int s = B.get(idx).get(0);
            int e = B.get(idx).get(1);
            if(s>0) arr.add(ans.get(e)-ans.get(s-1));
            else arr.add(ans.get(e));
        }
        return arr;
    }
}
