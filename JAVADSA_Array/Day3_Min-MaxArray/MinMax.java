public class MinMax {
       static void mm(){
         int minimum;
        int maximum;
        int temp;
        int[] arr={3,5,2,7,4,9,6};
        for(int i=0;i<=arr.length;i++){
            if(arr[i]>arr[i+1]){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            }
        }
    
       }
    public static void main(String[] args) {
       MinMax obj=new MinMax();
       obj.mm();

    }
}
