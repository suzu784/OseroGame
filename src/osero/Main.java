package osero;

import osero.config.StartConfig;
import osero.view.ShowBoard;

public class Main {

    //オセロの情報
    public static String white = "◯";
    public static String black = "●";

    //ボードの情報を保存する
    public static String board[][] = new String[9][9];

    public static void main(String[] args) {

        //インスタンスの作成
        StartConfig SC = new StartConfig();
        ShowBoard SB = new ShowBoard();

        System.out.println("オセロを開始します.");

        //ボードに初期値をセットする
        SC.boardInitValue();
        SC.boardSetup();
        //ボードを表示する
        SB.showBoard(board);
    }
}