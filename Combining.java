public class Combine{
	//insertion
	public static void main (String[] args){
		int[]arr = {1,5,69,10};
		int n = arr.length;
		
	
		for(int j = 1 ;j < n; j++){
			j = i-1;
			while(i>0 && arr[j] > arr[i]){
				int temp = arr[j];
				arr[j] = arr[j-i];
				arr[i] = temp;
			}
			
		}
		System.out.print(Arrays.toString(array));		
	}
}
//selection

	public static void main (String[] args){
	int[] arr = {10,4,69,13,46};

	for( int i = 0; i < arr.length -1; i++)
	{
		int index = i;
		for (int j = i +1; j < arr.length; j++){
			if (arr[j] < arr[index]){
				index = j;
			}
		}
		if(min != i){
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
	}
	System.out.print(arr[i]);
	}
}

//bubble


    public static void main (String[] args){

    int arr[] = {2,5,1,9};
    int n = arr.length;
    int temp = 0;
    for(int i = 0; i< n; i++){
        for (int j =1; j< (n-1); j++)
        if(arr[j-1] > arr[j]){  

                temp = arr[j-1];  
                arr[j-1] = arr[j];  
                arr[j] = temp;  
                }  
                          
          }  
      } 
      System.out.print();
   }
