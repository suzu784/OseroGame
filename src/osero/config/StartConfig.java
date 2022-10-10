package osero.config;

import osero.Main;

public class StartConfig {

    //オセロのボードに初期値「半角スペース」を設定する
    public void boardInitValue() {
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                Main.board[i][j] = " ";
            }
        }
    }

    //ボードの初期表示項目を設定する
    public void boardSetup() {
        for(int i=1; i<9; i++) {
            //x軸に数字を並べる
            Main.board[0][i] = String.valueOf(i);
            //y軸に数字を並べる
            Main.board[i][0] = String.valueOf(i);
        }
        //ゲーム開始時のオセロの配置
        Main.board[4][4] = Main.white;
        Main.board[5][4] = Main.black;
        Main.board[5][5] = Main.white;
        Main.board[4][5] = Main.black;
    }
}