package saketh;

public class QuadraticTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {1, 3, 4, 5, 3, 6, 9};
		boolean hasDuplicate = false;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] == numbers[j]) {
					hasDuplicate = true;
					System.out.println("Duplicate found: " + numbers[i]);
				}
			}
		}
		if(!hasDuplicate) {
			System.out.println("No duplicates found");
		}

	}

}
