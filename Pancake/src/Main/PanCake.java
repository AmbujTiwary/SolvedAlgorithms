package Main;

public class PanCake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {10, 5, 4, 3, 12, 15, 18, 6};
		PanCake pk = new PanCake();
		pk.pkSort(arr);	
	}
	
	//Indexed to be returned of maximum element in array

	int findMax(int arr[], int size)
	{
		int mi = 0, i =0;
		for(i = 0, mi = 0; i < size; i++)
		{
			if(arr[i] > arr[mi])
			{
				mi = i;
			}
		}
		return mi;
	}
	
	//Reverse the array
	void flip(int arr[], int i)
	{
		int temp , start = 0;
		while(start < i)
		{
			temp = arr[start];
			arr[start] = arr[i];
			arr[i] = temp;
			start++;
			i--;
		}
	}
	
	//Sorting is very similar with selection sort
	private void pkSort(int[] arr) {
		
		int length = arr.length;
		
		for(int i = length -1; i > 1; i--)
		{
			int m = findMax(arr, i);
			
			if(m != i-1)
			{
				flip(arr, m);
				flip(arr, i-1);
			}
		}
		
	}

}
