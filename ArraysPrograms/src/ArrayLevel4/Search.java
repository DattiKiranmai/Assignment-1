package ArrayLevel4;

public class Search {
public int binarySearch(int arr[],int low,int high,int key) {
	
	while(low<=high) {
		int mid=(low+high)/2;
		if(key==arr[mid]) {
			return mid;
		}
		else if(key>arr[mid]) {
			low=mid+1;
		}
		else {
			high=mid-1;
		}
	}
	return -1;
	
}
}
