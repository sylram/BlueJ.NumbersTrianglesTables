 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String x = "";
        for (int i=1;i<=numberOfStars;i++){
            x = x +"*";
       
        } 
        return x;
  }
    
    public static String getTriangle(int numberOfRows) {
        String x = "";
    for(int j=1; j<=numberOfRows;j++){
        for (int i=1;i<=j;i++){
            x = x +"*";    
        }
        x = x +("\n");
     }
        System.out.print(x);
        
        return x;
  }


    public static String getSmallTriangle() {
        System.out.print('\u000C');
    String x = "";
    for(int j=1; j<=4;j++){
        for (int i=1;i<=j;i++){
            x = x +"*";    
        }
        x = x +("\n");
     }
        System.out.print(x);
        
        return x;
  }
         
    

    public static String getLargeTriangle() {
           
    String x = "";
    for(int j=1; j<=9;j++){
        for (int i=1;i<=j;i++){
            x = x +"*";    
        }
        x = x +("\n");
     }
        
        System.out.print(x);
        return x;
  }
}

