public static boolean sumGame(String num) {
        int leftSum = 0, rightSum = 0, len = num.length(), leftEmpty = 0, rightEmpty = 0;
        for (int i = 0; i < len; i++) {
            char cur = num.charAt(i);
            if (i < len / 2) {
                if (cur == '?') leftEmpty++;
                else leftSum += cur - '0';
            } else {
                if (cur == '?') rightEmpty++;
                else rightSum += cur - '0';
            }
        }
//        If there are no any empty chars (?), then alice when leftSum is not same as rightsum.
        if (leftEmpty == 0 && rightEmpty == 0) return leftSum != rightSum;
//        If the number of blanks are odd, then alice wins since alice starts the game.
        if ((leftEmpty + rightEmpty) % 2 == 1) return true;
//            Since both the players are playing optimally, assume the extreme case where:
//                  alice place 9 on left then bob places 9 on right and visa-versa. Till left and right empty is same.
//                  And in the left\right over: (right-left) or (left-right)
//                      alice always places 9 and since bob has to match he is playing safe by keeping 0's.
        if (leftEmpty < rightEmpty) {
            int diff = (rightEmpty - leftEmpty) / 2;
            rightSum += 9 * diff;
        } else {
            int diff = (leftEmpty - rightEmpty) / 2;
            leftSum += 9 * diff;
        }
        return leftSum != rightSum;
    }
