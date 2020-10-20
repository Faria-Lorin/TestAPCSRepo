public class Demo{
public static void printLoop(int n){
    for(int i = 1; i <= n; i++){
      for(int j = i; j <= n; j++){
         System.out.print(i); //prints out rectangular shaped numbers (like the example above)
      }
      System.out.println();
    }
  }
public static void main(String[] args) {
  if (args.length == 0){
    Demo.printLoop(5);
  }
  Demo.printLoop(Integer.parseInt(args[0]));

  }
}
