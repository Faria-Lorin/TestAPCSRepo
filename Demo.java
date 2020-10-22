public class Demo{
  public static void printLoop(int n){
    for(int i = 1; i <= n; i++){
      for(int j = i; j <= n; j++){
         System.out.print(i);
      System.out.println();
    }
  }
}
  public static String arrToString(int[]arr){
    String sum = "";
    int n = 0;
    if (arr.length == 0){
        sum += "{}";
      }
    for (int i = 0; i < arr.length; i++){
        n = arr[i];
        if ( i == 0){
            sum += "{"+ n +", ";
          }
        else if ( i != arr.length - 1) {
            sum += n + ", ";
          }
        else {
            sum += n + "}";
          }
        }
    if (arr.length == 1){
        sum = "{" + arr[0] + "}";
      }
    return sum;
  }
  public static String arrayDeepToString(int[][] arr){
    String duo = "{";
    for (int i = 0; i < arr.length; i++){
      duo += Demo.arrToString(arr[i]);
      if (i != arr.length - 1){
        duo += ", ";
      }
        }
      duo += "}";
      return duo;
  }
  public static void main(String[] args) {
    /*if (args.length == 0){
      Demo.printLoop(5);
    }
    Demo.printLoop(Integer.parseInt(args[0]));
    int[] arr = {1,2,3,4,5};
    System.out.println(Demo.arrToString(arr));*/
    int[][] arr2 = {{1, 2, 3}, {}, {8, 2, 3, 1}, {1}};
    System.out.println(Demo.arrayDeepToString(arr2));
    }
  }
