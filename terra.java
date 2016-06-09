import java.util.*;

public class terra{
      
      private int value;
      private String addr;
      
      public static void main(){
          terra one = new terra(1);
          terra two = new terra(2);
          }
          
      public terra (int x){
          if(x>10){
              terra.value = x;
          }else{
              terra.value = 10;
          }
          
      }
