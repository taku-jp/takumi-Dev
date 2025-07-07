import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Car {
    private double fuelEfficiency;
    private double fuelTank;
    private double gas;

    public Car() {
        fuelEfficiency = 0;
        fuelTank = 0;
        gas = 0;
        System.out.println("車を作成しました");
    }

    public void setCar(double fT, double g) {
        fuelTank = fT;
        gas = g;
        System.out.println("残燃料: " + gas + " L, タンク容量: " + fuelTank + " L");
    }

    public void show() {
        fuelEfficiency = 10;
        System.out.println("ガソリン量: " + gas + " L");
        System.out.println("残燃料: " + gas + " L");
        System.out.println("燃費: " + fuelEfficiency + " km/L");
    }

    public void refuel() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("燃料を追加しますか？ (Y/N): ");
            String choice = br.readLine();

            if (choice.equalsIgnoreCase("Y")) {
                System.out.print("追加する燃料量を入力してください (L): ");
                double refuelAmount = Double.parseDouble(br.readLine());

                if (refuelAmount < 0) {
                    throw new IllegalArgumentException("給油量はマイナスにすることはできません");
                }

                if (gas + refuelAmount > fuelTank) {
                    throw new IllegalArgumentException("燃料タンクの容量を超える給油量です");
                }

                gas += refuelAmount;
                System.out.println("給油しました。残燃料: " + gas + " L");
            } else if (choice.equalsIgnoreCase("N")) {
                System.out.println("給油をキャンセルしました");
            } else {
                throw new IllegalArgumentException("YまたはNで回答してください");
            }
        } catch (NumberFormatException e) {
            System.out.println("数値の形式が正しくありません");
        } catch (IOException e) {
            System.out.println("入出力エラーが発生しました: " + e);
        } catch (IllegalArgumentException e) {
            System.out.println("給油エラー: " + e);
        }
    }
}

class RacingCar extends Car {
    private String name;

    public RacingCar() {
        name = "myCar";
        System.out.println("レーシングカーを作成しました");
        System.out.println("Carname: " + name);
    }
}

public class Exercise {
    public static void main(String[] args) {
        RacingCar rccar1 = new RacingCar();
        rccar1.setCar(30.0, 10.0);
        rccar1.show();
        rccar1.refuel();
    }
}
