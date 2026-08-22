class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> row = new ArrayList<>();
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            row.add(1);
            for(int j = 0; j < i - 1; j++) {
                row.add(triangle.get(i - 1).get(j) + triangle.get(i - 1).get(j + 1));
            }
            if(i != 0) {
                row.add(1);
            }
            triangle.add(row);
            row = new ArrayList<>();
        }
        return triangle;
    }
}