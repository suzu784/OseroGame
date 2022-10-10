package osero.view;

public class ShowBoard {

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
    }
}