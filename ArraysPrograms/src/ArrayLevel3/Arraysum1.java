package ArrayLevel3;

public class Arraysum1 {
int findSum(int arr[],int sum) {
	for(int i=0;i<=arr.length-1;i++) {
		sum=arr[i]+sum;
	}
	return sum;
}
}
