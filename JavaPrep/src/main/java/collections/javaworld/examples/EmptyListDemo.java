package collections.javaworld.examples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Flowers
{
   private List<String> flowers;

   Flowers()
   {
     // flowers = Collections.emptyList();
   }

   Flowers(String... flowerNames)
   {
      flowers = new ArrayList<String>();
      for (String flowerName: flowerNames)
         flowers.add(flowerName);
   }

   @Override
   public String toString()
   {
      return flowers.toString();
   }
}

public class EmptyListDemo
{
   public static void main(String[] args)
   {
      Flowers flowers = new Flowers();
      System.out.println(flowers);
      flowers = new Flowers("Rose", "Violet", "Marigold");
      System.out.println(flowers);
   }
}