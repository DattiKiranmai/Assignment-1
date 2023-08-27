package ArrayLevel3;

public class Merge2 {
int[] mergeArray(int arr1[],int arr2[]) {
	int arr3[]=new int[arr1.length+arr2.length];
	int i=0;
	int index=0;
	while(i<=arr1.length-1) {
		arr3[index]=arr1[i];
		index++;
		i++;
	}
	i=0;
	while(i<=arr2.length-1) {
		arr3[index]=arr2[i];
		index++;
		i++;
	}
	
	return arr3;
}
}
