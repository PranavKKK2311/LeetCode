class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int n = num.length, carry = 0;

        for (int i = n - 1; i >= 0 || k > 0 || carry > 0; i--) {
            int numVal = (i >= 0) ? num[i] : 0;
            int digit = (k % 10) + numVal + carry;
            result.add(digit % 10);
            carry = digit / 10;
            k /= 10;
        }
        
        Collections.reverse(result);
        return result;
    }
}
