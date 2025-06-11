package saketh;

public class LogTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []numbers = {2, 5, 7, 9, 10, 12, 13, 19};
		int target = 19;
		int left = 0;
		int result = -1;
		int right = numbers.length - 1;
		while(left <= right){
			int mid = left + (right - left) / 2;
			if(numbers[mid] == target) {
				result = mid;
				right = mid - 1;
			}else if(target > numbers[mid]) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		if(result != -1) {
			System.out.println("Target element " + target + " is found at the index " + result);
		}else {
			System.out.println("Target element is not found in the array");
		}

	}

}
