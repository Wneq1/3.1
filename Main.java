class Main {
  public static void main(String[] args) {
    int x =4;
    for(int i=0; i<x; i++){
      for(int j=1; j<=x-i;j++)
        System.out.print("Z");
      
      for(int j=0; j<i+1;j++)
        System.out.print("*");
      
      System.out.println();
    }
    
  }
}