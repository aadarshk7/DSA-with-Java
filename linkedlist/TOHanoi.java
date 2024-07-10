package linkedlist;

public class TOHanoi {
	public static void main(String[] args) {
		TOHanoi toh=new TOHanoi();
		toh.TowerOfHanoi(2, "Source", "Destinaion", "Helper ");
	}
		
		void TowerOfHanoi(int n,String source, String destination, String helper){
			
		if(n<=0) {
			return;
		}
		else {
			TowerOfHanoi(n-1,source,helper,destination);
			System.out.println("Disk "+n+ " has been moved from "+source+ " to "+destination);
			TowerOfHanoi(n-1,helper,destination,source);
		}
	}

}

/**                       copyright © Aadarsh Kunwar                       **/