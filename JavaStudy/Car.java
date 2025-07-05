import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Car {
    private String nume;
    private double fuelEfficiency;
    private double fuelTank;
    private double fuel;
    private double xPosition;
    private double yPosition;

    public Car() {
        nume = "myCar";
        fuelEfficiency = 10.0;
        fuelTank = 160.0;
        fuel = 0.0;
        xPosition = 0.0;
        yPosition = 0.0;
        System.out.println("車を作成しました。");
    }

    public void show() {
    	
        System.out.print("車の名前は" + nume + "です\n");
        System.out.print("車の走行量(km/l)は" + fuelEfficiency + "です\n");
        System.out.print("車のタンク容量は" + fuelTank + "です\n");
        System.out.print("車の残燃料は" + fuel + "です\n");
        System.out.println("現在位置はx軸" + xPosition + " y軸" + yPosition + "です");
    }

    public void setFuel(String choice) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            if (fuel > 9) {
                System.out.print("走行しますか？ (Y/N): ");
                String runChoice = br.readLine();
                if (runChoice.equalsIgnoreCase("y")) {
                    System.out.println("走行します。");
                    fuel -= 10;
                    move();
                    System.out.print("残燃料は" + fuel + "です");
                    continue; // 燃料を追加する処理をスキップして次のループに進む
                } else {
                    System.out.println("走行をキャンセルしました。");
                    break;
                }
            }

            if (choice.equalsIgnoreCase("y")) {
                System.out.print("燃料を追加する量を入力してください: ");
                String str = br.readLine();
                double gas = Double.parseDouble(str);
                System.out.println(gas + "が入力されました");

                // タンク容量を超えている場合は正しい数値の入力を促す
                while (fuel + gas > fuelTank) {
                    System.out.println("タンク容量を超えています。もう一度入力してください。");
                    str = br.readLine();
                    gas = Double.parseDouble(str);
                }

                fuel += gas;
            } else if (choice.equalsIgnoreCase("n")) {
                System.out.println("給油は行いません。");
            } else {
                System.out.println("無効な選択です。");
            }

            System.out.print("燃料を追加しますか？ (Y/N): "); // 燃料追加の処理後に再度選択を促す
            choice = br.readLine();
        }
    }

    public void move() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("x軸の値を入力してください: ");
        double x = Double.parseDouble(br.readLine());

        System.out.print("y軸の値を入力してください: ");
        double y = Double.parseDouble(br.readLine());

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double requiredFuel = distance / fuelEfficiency;

        if (requiredFuel <= fuel) {
        	
            xPosition += x;
            yPosition += y;
            fuel -= requiredFuel;
            System.out.println("現在位置はx軸" + xPosition + " y軸" + yPosition + "です");
        } else {
            System.out.println("残燃料が足りません。");
        }
    }
}

public class EX1 {
    public static void main(String[] args) throws IOException {
        Car car1 = new Car();
        car1.show();

        System.out.print("燃料を追加しますか？ (Y/N): ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String choice = br.readLine();
        car1.setFuel(choice);

        car1.show();
    }
}
