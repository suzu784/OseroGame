package osero.model;

public class CopyBoard {

	// 2次元配列のコピー
	public String[][] copySaveBoard(String board[][]) {
		
		// returnする2次元配列の作成
		String saveBoard[][] = new String[9][9];
		
		// 引数で渡した2次元配列をfor文で1つずつ
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				String str = board[i][j];
				saveBoard[i][j] = str;
			}
		}
		return saveBoard;
	}
}
