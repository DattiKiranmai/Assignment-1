package SortingTech;

public class SortingTech1 {	
public int[] bubbleSorting(int arr[]) {
	int help;
	for(int i=0;i<=(arr.length-2);i++) {
		for(int j=0;j<=arr.length-2-i;j++) {
			if(arr[j]>arr[j+1]) {
				help=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=help;
			}
		}
	}
	return arr;
}
public int[] selectionSorting(int arr[]) {
	int help;
	int min;
	int pos;
	for(int i=0;i<=arr.length-2;i++) {
		min=arr[i];
		pos=i;
		for(int j=i+1;j<=arr.length-1;j++) {
		if(arr[j]<min) {
			min=arr[j];
			pos=j;
		}
		}
		help=arr[i];
		arr[i]=arr[pos];
		arr[pos]=help;
	}
	return arr;
}
public int[] insertionSorting(int arr[]) {
	for(int i=1;i<=arr.length-1;i++) {
		int item=arr[i];
		int j=i-1;
		while((j>=0)&&(arr[j]>item)) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=item;
	}
	return arr;
}
}

