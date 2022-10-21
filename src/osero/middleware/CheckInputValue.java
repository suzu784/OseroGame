package osero.middleware;

public class CheckInputValue {

	//　入力値が1~8の半角数字かチェックする
	public boolean checkInt1_8(String str) {
		// 入力値が1~8ならtrue
		if(str.matches("[1-8")) {
			return true;
		}
		
		// 文字やそれ以外の数字を入力したらfalse
		return false;
	}
}
