class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double [][] pair = new double[position.length][2];
        for(int i=0 ; i < position.length ; i++)
        {
            pair[i][0] = position[i];
            pair[i][1] = (double) (target - position[i])/speed[i]; 
        }
        Arrays.sort(pair, (a,b) -> Double.compare(b[0],a[0]));
        Stack<Double> stack = new Stack<>();
        for(double[] p:pair)
        {
            stack.push(p[1]);
            if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2))
            {
                stack.pop();
            }
        }
        return stack.size();
    }
}
