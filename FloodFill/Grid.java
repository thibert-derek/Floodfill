import java.util.Stack;

public class Grid {

    private final static int SIZE = 10;
    private Stack<Pair<Integer, Integer>> stack = new Stack<>();
    private int[][] coor = new int[SIZE][SIZE];

   public void floodfill(int first, int second){
       int num = -99;
       coor[first][second] = num;
       num++;
       stack.push(new Pair(first, second));

       while (!stack.empty()) {
           Pair p = stack.pop();
           int f = (Integer) p.getFirst();
           int s = (Integer) p.getSecond();

           if( f > 0 && coor[f-1][s] == 0){
               coor[f-1][s] = num;
               num++;
               stack.push(new Pair(f-1,s));
           }

           if(s < SIZE - 1 && coor[f][s+1] == 0){
               coor[f][s+1]= num;
               num++;
               stack.push(new Pair(f,s+1));
           }

           if(f < SIZE - 1 && coor[f+1][s] == 0){
               coor[f+1][s] = num;
               num++;
               stack.push(new Pair(f+1, s));
           }

           if(s > 0 && coor[f][s-1] == 0){
               coor[f][s-1] = num;
               num++;
               stack.push(new Pair(f, s-1));
           }
       }
   }

   public void reset(){
       for(int i = 0; i < SIZE; i++){
           for (int j = 0; j < SIZE; j++){
               coor[i][j] = 0;
           }
       }
   }

   @Override
   public String toString() {
       String line = "";
       for (int i=0; i < SIZE; i++)
       {
           for (int j = 0; j < SIZE; j++)
           {
               line = line + String.format("%4d", coor[i][j]);
           }
           line = line + "\n";
       }
       return line;
   }
}
// Class Grid

/***************
 Complete this part
 Based on the description of problem 2, develop the Grid class
 ***************/
