public class Selection
{
    
    //@Author LwinPhyoAung(codeCat)
    
    public static void sort(Comparable[] arr){
        
        int N = arr.length;
        
        for(int i = 0; i < N; i++){
            
            int minInd = i;
            
            for(int j = i+1; j < N; j++){
                
               if(less(arr[j],arr[minInd])){
                   minInd = j;
               }
                
            }
            
            swap(arr,i,minInd);
            
        }
        
    }
    
    private static boolean less(Comparable a,Comparable b){
        return a.compareTo(b) < 0;
    }
    
    private static void swap(Comparable[] arr,int a,int b){
        
        Comparable temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        
    }
    
}
