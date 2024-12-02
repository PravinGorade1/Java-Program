public class MaximumSumOfSubArray
{
	public static void main(String x[])
	{
		int arr[] = new int[]{1,3,6,21,4,9,12,3,16,10};
		for(int i=0;i<arr.length-3;i++)
		{
			int max = arr[i];
			for(int j=i;j<i+4;j++){
				System.out.print(arr[j]+" ");
				if(max<arr[j]){
					max = arr[j];
				}
			}
			System.out.print("--->"+ max);
			System.out.println();
		}
	}
}