package exercise008;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//文字列の調査
		List<String> sCheck = List.of("java", "JaVA", "JavaScript");
		System.out.println(String.join(", ", sCheck));
		if(sCheck.get(0).equalsIgnoreCase(sCheck.get(1))) {
			System.out.println("一文字目と二文字目はケースを無視すれば等しい");
		}
		if(sCheck.get(1).length() < sCheck.get(2).length()) {
			System.out.println("二文字目より三文字目の方が長い");
		}
		if(!sCheck.get(2).isEmpty()) {
			System.out.println("三文字目は空文字ではない\n");
		}
		
		//文字列の検索
		String sSearch = "No pain no gain";
		System.out.println(sSearch);
		if(sSearch.contains("pain") && sSearch.startsWith("No")) {
			System.out.println("文字列はpainを含み、Noで始まる");
			System.out.println("painが最初に登場するのは" + sSearch.indexOf("pain") + "\n");
		}
		
		//文字列の変換
		String sConvert = " all is fair in love and  war ";
		System.out.println(sConvert);
		System.out.println("大文字に変換：" + sConvert.toUpperCase());
		System.out.println("前後の空白を除去：" + sConvert.trim());
		System.out.println("文字列を置き換える：" + sConvert.replace("war", "programing") + "\n");
		
		//文字列の連結
		System.out.println("StringBuilderを用いて文字列を連結します");
		StringBuilder sb = new StringBuilder();
		//バッファに文字列を追加
		sb.append("りんご"); sb.append("ごりら"); sb.append("ラッパ");
		//メソッドチェーンも可
		sb.append("パチンコ").append("こども").append("もちろん");
		//連結した文字列を取り出す
		System.out.println(sb.toString() + "\n");
		
		//正規表現を用いた処理
		String pass1 = "Gbi2g6lo9";
		String pass2 = "cku8t6";
		//条件：全部で10文字以下、最初の文字は大文字、最後の文字は数字、それ以外は任意の英数字
		if(pass1.matches("^[A-Z][a-zA-Z0-9]{0,8}[ 0-9]$")){
			System.out.println("pass1はログイン成功");
		}else {
			System.out.println("pass1はログイン失敗");
		}
		if(pass2.matches("^[A-Z][a-zA-Z0-9]{0,8}[ 0-9]$")){
			System.out.println("pass2はログイン成功");
		}else {
			System.out.println("pass2はログイン失敗");
		}
		//splitメソッドを使った文字列の分割
		String sSplit = "りんご,ごりら:らくご";
		String[] words = sSplit.split("[,:]");
		for(String w: words) {
			System.out.print(w + "->");
		}
		System.out.println();
		//replaceAllメソッドを使った文字列の置換
		String sReplaceBefore = "なまむぎ、なまごめ、なまたまご";
		System.out.println(sReplaceBefore);
		String sReplaceAfter = sReplaceBefore.replaceAll("[なま]","?");
		System.out.println(sReplaceAfter + "\n");
		
	}

}
