public class PracticeProblem {

	public static void main(String args[]) {
	}
	public static String pyramid(int rows) {
		String response = "";
		int rowlength = rows-1;
		int count = 1;
		while (rowlength>=0) {
			for (int i = 0;i<rowlength;i++) {
				response = response + " ";
			}
			for (int i = 0;i<((count*2)-1);i++) {
				if (i % 2 == 0) {
					response = response + "*";
				} else {
					response = response + " ";
				}
			}
			rowlength-=1;
			count += 1;
			if (rowlength >= 0) {
				response = response + "\n";
			}
		}
		return response;
	}
	public static String square(int rows) {
		String response = "";
		if (rows <= 0) {
			return "";
		} else if (rows == 1) {
			return "*";
		} else {
		for (int i = 0;i<rows;i++) {
			response = response+"*";
		}
		response = response + "\n";
		for (int i = 0;i<rows-2;i++) {
			response = response+"*";
			for (int j = 0;j<rows-2;j++) {
				response = response+" ";
			}
			response = response+"*";
			response = response + "\n";
		}
		for (int i = 0;i<rows;i++) {
			response = response+"*";
		}
		return response;
		}
	}
	public static boolean hasLowercase(String input) {
		for (int i = 0;i<input.length();i++) {
			if (Character.isLowerCase(input.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}
