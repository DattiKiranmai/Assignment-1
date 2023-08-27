package ArrayPractice2;

public class SetBit4 {
public int countSetBit(int num) {
	int count=0;
	while(num>0) {    //num=8,num-1=7
		num &=(num-1);//num=num&(num-1)
		count++;      //num=(1000)&(0111)
		//num=0 than count =1 control will out of the loop 
		// print count
	}
return count;
}
}
