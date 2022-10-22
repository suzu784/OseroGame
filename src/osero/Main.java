package osero;

import java.util.Scanner;

import osero.config.StartConfig;
import osero.middleware.CheckInputValue;
import osero.model.ReverseOsero;
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
    
    static String x = "0";
    static String y = "0";

    public static void main(String[] args) {

        //インスタンスの作成
        StartConfig SC = new StartConfig();
        ShowBoard SB = new ShowBoard();
        Scanner sc = new Scanner(System.in);
        ReverseOsero RO = new ReverseOsero();
        CheckInputValue CIV = new CheckInputValue();

        System.out.println("オセロを開始します.");

        //ボードに初期値をセットする
        SC.boardInitValue();
        SC.boardSetup();
        //ボードを表示する
        SB.showBoard(board);
        
        while(true) {
        	// x座標を入力する処理
        	System.out.println("横の座標を1~8の半角数字で入力してください");
        	x = sc.next();
        	if (CIV.checkInt1_8(x)) {
        		inputX = Integer.parseInt(x);
        	} else {
        		System.out.println("!!!!!!!!!!その値は無効です!!!!!!!!!!");
        		System.out.println("1~8の半角数字を入力してください");
        	}
        }
        
        while(true){
            //Y座標を入力する処理
            System.out.println("縦の座標を1~8の半角数字で入力してください");
            y = sc.next();

            if(CIV.checkInt1_8(y)) {
                inputy = Integer.parseInt(y);
            }else {
                System.out.println("!!!!!!!!!!その値は無効です!!!!!!!!!!");
                System.out.println("1~8の半角数字を入力してください");
            }
        }
        
        
        // 入力した座標にオセロを置く
        RO.putOsero(inputX, inputy);
        
        SB.showBoard(board);
    }
}