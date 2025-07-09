
public class Sample1 {
	public static void main(String[] args) {
		try {
			int[] test;
			test = new int[5];

			System.out.println("test[10]に代入します");
			test[10] = 80;
			int num =8/0;
			System.out.println("test[10]に80を代入しました");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列を超えています");
			System.out.println(e + "という例外が発生しました");

		}
		catch(ArithmeticException e) {
			System.out.println("0除算されています");
			System.out.println(e +"という例外が発生しました");
		}
		catch(Exception e){
			System.out.println("スーパークラスをExceptionで受け取りました");
			System.out.println(e +"という例外が発生"); 
		}
		finally {
			System.out.println("最後にこの処理をします");
		}
		System.out.println("無事終了");

	}
}
