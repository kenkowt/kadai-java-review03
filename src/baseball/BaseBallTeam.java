package baseball;

public class BaseBallTeam {
 // フィールド
    private String name; // チーム名
    private int win;      // 勝ち数
    private int lose; // 負け数
    private int draw; // 引き分け数

    /*// 引数なしのコンストラクタ（念のため記述しただけなので中身は空でOK）
    public Character() {
    }
    */

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // 勝率を計算するメソッド
    public double getRate() {
        // 勝率の計算（勝ち数/（勝ち数+負け数））
        double winRate = (double)this.win/(this.win + this.lose);
        return winRate;
    }
    
    // 勝敗、勝率を表示するメソッド
    public void report(){
        double winRate = getRate();
        System.out.println(this.name + " の2022年の成績は " + this.win + " 勝 " + this.lose + " 敗 " + this.draw + " 分、勝率は " + winRate + " です。 ");
    }
}
