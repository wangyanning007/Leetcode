import java.util.Scanner;

public class MaxSeqLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start, sum, maxCont , count, started = 0;
		Scanner scanner = new Scanner(System.in);
		String ss = null;
		while ((ss = scanner.nextLine()) != null) {
			maxCont=0;
			String[] string = ss.trim().split("\\s+");
			int[] a = new int[string.length];
			for (int i = 0; i < string.length; i++) {
				a[i] = Integer.parseInt(string[i]);
			}
			for (int i = 0; i < string.length; i++) {
				
				sum = 0;
				count = 0;
				start = i;
				if ((string.length - i - 1) < maxCont)
					break;
				for (int j = i; j < string.length; j++) {
					sum += a[j];
					count += 1;
					if (sum == 0) {
						if (count > maxCont) {
							maxCont = count;
							started = start;
						}
					}
				}
			}
			System.out.println("maxCount:" + maxCont + "         started:"
					+ started);
		}

	}

}
