 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5) ;
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String tabla="";
        
        for (int i=1; i<tableSize+1;i++){
            
            for(int j=1;j<tableSize+1;j++){
                tabla += String.format("%3d |", i*j);
        }
            tabla += "\n";}
       
        
        return tabla;
    }
}
