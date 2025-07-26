class Square { // 長方形に関するクラス
    int height;
    int width;

    Square(int height, int width) {
        this.height = height;
        this.width = width;
        System.out.println("高さ" + height + "m 幅" + width + "m");
    }

    int getArea() { // 面積を呼び出し元に返す
        return height * width;
    }

    int getRound() { // 周囲の長さを計算し呼び出し元に戻す
        return 2 * (height + width);
    }
}

class Circle { // 円に関するクラス
    int r;
    double pi = 3.14;
    double space, round;

    Circle(int r) { // コンストラクタ
        this.r = r;
        System.out.println("半径" + r + "m");
    }

    void calc() {
        space = pi * r * r;
        round = 2 * pi * r;
    }

    void show() {
        System.out.println("円の面積" + space + "㎡");
        System.out.println("円の周囲" + round + "m");
    }
}

public class Exec_cdlc {
    public static void main(String[] args) {
        Square S = new Square(10, 20);
        Circle C = new Circle(6);

        System.out.println("長方形の面積" + S.getArea() + "㎡");
        System.out.println("長方形の周囲" + S.getRound() + "m");
        C.calc();
        C.show();
    }
}
