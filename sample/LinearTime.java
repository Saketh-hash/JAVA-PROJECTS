package saketh;

public class LinearTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p[] = {1,2,3,4,5,6};
		int n = p.length;
		boolean target = false;
		for(int i = 0; i < n; i++) {
			if(p[i] == 5) {
				target = true;
				break;
			}
		}
		if(target) {
			System.out.println("Target is found");
		}else {
			System.out.println("Target is not found");
		}
			
		
	}

}
