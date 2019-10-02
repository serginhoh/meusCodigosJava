
public class Loop2 {
	public static void main(String[] args) {
		int total = 0;
		
		for (int i = 1; i <= 1000; i++) {
			total += i;
			
			if (total == 2) {
				break;
			}
		}
		System.out.println(total);
	}
}
