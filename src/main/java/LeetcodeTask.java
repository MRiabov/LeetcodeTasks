public class LeetcodeTask {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        String min = strs[0];
        for (String word : strs)
            if (!word.startsWith(min)) {
                for (int i = 0; i < Math.min(word.length(), min.length()); i++)
                    if (word.charAt(i) == min.charAt(i))
                        stringBuilder.append(min.charAt(i));
                    else break;
                min = stringBuilder.toString();
                stringBuilder.setLength(0);
            }
        return min;
    }

}


// for (int y = 0; y < grid.length; y++) {
//            for (int x = 0; x < grid[0].length; x++) {
//                if (grid[y][x]==1){
//                    if (x+1!=grid[0].length&&grid[y][x+1]==1)
//                } else {
//
//                }
//            }
//        }