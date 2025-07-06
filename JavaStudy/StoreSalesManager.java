import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Store {
    private String s_name;
    private int sales;
    private static int total;
    private static int count;

    public Store(String str) {
        s_name = str;
        sales = 0;
        System.out.println(s_name + "店を作成");
        count++;
    }

    public void ADD_sales(int add) {
        sales += add;
        total += add;
    }

    public static void Sales_Total() {
        System.out.println("全店舗総売上高: " + total + "￥");
    }

    public static void Sales_Average() {
        double ave = (double) total / count;
        System.out.println("平均売上: " + ave + "￥");
    }

    public void addSales() {
        System.out.println(s_name + "店 >> 売上: " + sales + "￥");
    }
}

class EX2 {
    public static void main(String[] args) throws IOException {
        String[] stores = {"千葉", "市川", "稲毛", "成田"};
        Store[] st = new Store[stores.length];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < stores.length; i++) {
            st[i] = new Store(stores[i]);
            System.out.print(stores[i] + "店の売上を入力してください: ");
            int sales = Integer.parseInt(br.readLine());
            st[i].ADD_sales(sales);
        }

        for (int i = 0; i < st.length; i++) {
            st[i].addSales();
        }

        Store.Sales_Total();
        Store.Sales_Average();
    }
}
