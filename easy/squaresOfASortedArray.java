class Solution {
    public int[] sortedSquares(int[] A) {
        int lenA  = A.length;
        for(int i = 0; i < lenA; i++) {
            A[i] = A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
}