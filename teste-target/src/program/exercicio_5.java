package program;

public class exercicio_5 {

	public static void main(String[] args) {

		String text = "a b c d e";
		String[] arr = text.split(" ");
		String result = "";

		for (int i = arr.length -1; i >= 0; i--) {
			result += arr[i];
		}
		System.out.println(result);
	}
}
