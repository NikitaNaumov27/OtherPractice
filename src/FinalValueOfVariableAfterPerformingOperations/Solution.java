package FinalValueOfVariableAfterPerformingOperations;

class Solution {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (String operation : operations) {
            if (operation.contains("+")) count++;
            else count--;
        }
        return count;
    }
}
