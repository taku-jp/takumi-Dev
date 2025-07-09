import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Sample7 {
    public static void main(String[] args) {
        // try-with-resourcesを使って自動的にclose()
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")))) {
            pw.println("Hello!");
            pw.println("GoodBye!");
            System.out.println("ファイルに書き込めました");
        } catch (IOException e) {
            System.out.println("入出力エラーです");
        }
    }
}
