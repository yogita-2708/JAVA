class DectoBinary {
  public static void main(String args[]){
      int[] binaryNum=new int[10]; //array to store binary number
      int i,num=17;
      System.out.println("Binary number of "+num+" is: ");
      for(i=0;num>0;i++)
      {
          binaryNum[i] = num%2;
          num=num/2;
      }
      for(i=i-1;i>=0;i--)
      {
      System.out.print(binaryNum[i]);
      }
  }  
}
