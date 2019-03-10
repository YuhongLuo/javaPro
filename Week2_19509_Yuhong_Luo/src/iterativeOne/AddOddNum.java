package iterativeOne;

public class AddOddNum {
	
	private int num;
	
	public AddOddNum(int num) {
		this.num = num;
	}	
	
	public int AddOdd() {
	int sum=0;	
	for (int i=1;i<= num;i=i+2) {
		 sum = sum+i;    
	}
    return sum;
    }
}
	
