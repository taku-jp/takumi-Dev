import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 class Sample5 {
public static void main(String[] argas) throws IOException{
	System.out.print("整数を二つ入力してください");
	
	BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in) );
	
	String str1= br.readLine();
	String str2= br.readLine();
	int num1 =Integer.parseInt(str1);
	int num2 =Integer.parseInt(str2);
	int ans =Math.max(num1, num2);
	int min =Math.min(num1, num2);
	
	System.out.print(num1 +"と" +num2 +"のうち大きいほうは" +ans +"で小さいのは、" +min +"です");
}
}
