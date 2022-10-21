package osero.model;

import osero.Main;

public class CountBlackWhite {

	// 黒の数を数えてその値を返す
	public int countBlack(String[][] b) {
		int black = 0;
		for(int i = 1; i < 9; i++) {
			for(int j = 1; j < 9; j++) {
				if(b[j][i] == Main.black ) {
					black++;
				}
			}
		}
		return black;
	}
	
	// 白の数を数えてその値を返す
	public int countWhite(String[][] b) {
		int white = 0;
		for(int i = 1; i < 9; i++) {
			for(int j = 1; j < 9; j++) {
				if(b[j][i] == Main.white) {
					white++;
				}
			}
		}
		return white;
	}
}
