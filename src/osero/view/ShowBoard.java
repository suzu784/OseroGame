package osero.view;

import osero.Main;
import osero.model.CountBlackWhite;

public class ShowBoard {
	
	// インスタンスの作成
	CountBlackWhite CBW = new CountBlackWhite();

    //Mainのboard配列を受け取って、それをもとにオセロボードを表示する
    public void showBoard(String[][] board) {

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                System.out.print("｜" + board[j][i]);

                //７列目記載の際に、最後に「｜」を入れて改行する
                if(j==8) {
                    System.out.println("｜");
                }
            }
        }
        
        // ボード上のオセロの数を数えて表示する
        System.out.println("黒の数：" + CBW.countBlack(Main.board));
        System.out.println("白の数：" + CBW.countWhite(Main.board));
    }
}