// Last updated: 9/19/2025, 11:49:27 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < asteroids.length; i++){
            int number = asteroids[i];
            if(number > 0){
                list.add(number);
            }
            else{
                boolean alive = true;
                while (alive && !list.isEmpty() && list.get(list.size() - 1) > 0) {
                    int top = list.get(list.size() - 1);
                    if (top < -number) {
                        list.remove(list.size() - 1);
                    } else if (top == -number) {
                        list.remove(list.size() - 1);
                        alive = false;
                    } else {
                        alive = false;
                    }
                }
                if (alive) {
                    list.add(number);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) result[i] = list.get(i);
        return result;
    }
}