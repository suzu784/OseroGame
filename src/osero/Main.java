package osero;

import java.util.Scanner;

import osero.config.StartConfig;
import osero.view.ShowBoard;

public class Main {

    //オセロの情報
    public static String white = "◯";
    public static String black = "●";

    //ボードの情報を保存する
    public static String board[][] = new String[9][9];
    
    // 入力値の情報を保持する
    private static int inputX;
    private static int inputy;

    public static void main(String[] args) {

        //インスタンスの作成
        StartConfig SC = new StartConfig();
        ShowBoard SB = new ShowBoard();
        Scanner sc = new Scanner(System.in);

        System.out.println("オセロを開始します.");

        //ボードに初期値をセットする
        SC.boardInitValue();
        SC.boardSetup();
        //ボードを表示する
        SB.showBoard(board);
        
        // x座標を入力する処理
        System.out.println("横の座標を1~8の半角数字で入力してください");
        inputX = sc.nextInt();
        
        // y座標を入力する処理
        System.out.println("縦の座標を1~8の半角数字で入力してください");
        inputy = sc.nextInt();
    }
}