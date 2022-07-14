public class Driver{
  
  public static void barGraphy (int [] array){
    
    String a;
    
    for(int i = 0; i<array.length; i++){
       a="";
      for(int j = 0; j<array[i]; j++){
        a+="="; 
      }
      System.out.println(array[i] + " " + a );
    }  
    
  }

  public static void main(String[] args){

    int [] array = new int [5];
    
    array [0] = 0;
    array [1] = 1;
    array [2] = 2;
    array [3] = 3;
    array [4] = 4;
  
    barGraphy(array);
      
  }
}