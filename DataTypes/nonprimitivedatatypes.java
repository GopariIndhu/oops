package Java;

public class nonprimitivedatatypes {

	public static void main(String[] args) {
		String str = "test";
		System.out.println("String is: " + str);
		
		String str1 = new String("test");
		System.out.println("Anthoer String: " + str1);
		
		int arr[];
		arr = new int[3];
		arr[0] = 80;
		arr[1] = 91;
		arr[2] = 72;
		
		System.out.println(arr);
		System.out.println(arr[2]);
	}

}
