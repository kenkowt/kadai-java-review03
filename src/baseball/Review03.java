package baseball;

public class Review03 {

    public static void main(String[] args) {
        // 各チームのインスタンスを生成
        BaseBallTeam tys = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam ydb = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam htg = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam ygi = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam htc = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam cdg = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
        
        tys.report();     // ヤクルトの勝敗情報を表示
        ydb.report();     // DeNAの勝敗情報を表示
        htg.report();     // 阪神の勝敗情報を表示
        ygi.report();     // 読売の勝敗情報を表示
        htc.report();     // 広島の勝敗情報を表示
        cdg.report();     // 中日の勝敗情報を表示
        
    }
}
