class Solution {
    public boolean canReach(int[] start, int[] target) {
        int sIj = start[0] + start[1];
        int tIj = target[0] + target[1];

        if ((sIj % 2 == 0) && (tIj % 2 == 0)) {
            return true;
        } else if ((sIj % 2 != 0) && (tIj % 2 != 0)) {
            return true;
        } else {
            return false;
        }

    }
}