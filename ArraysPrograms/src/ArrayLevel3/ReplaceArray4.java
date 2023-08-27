package ArrayLevel3;
import java.util.Scanner;
public class ReplaceArray4 {
void replaceNegativeArray(int arr[]) {
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]<0) {
			arr[i]=0;
		}
	}
	
}
}

