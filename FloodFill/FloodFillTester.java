public class FloodFillTester
{
   public static void main(String[] args)
   {
      Grid gr = new Grid();
      gr.floodfill(0, 9);
      System.out.println(gr.toString());
      gr.reset();
      gr.floodfill(5, 5);
      System.out.println(gr.toString());
      gr.reset();
      gr.floodfill(4, 4);
      System.out.println(gr.toString());
      gr.reset();
      gr.floodfill(9, 0);
      System.out.println(gr.toString());
   }
}
