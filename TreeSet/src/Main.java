import java.util.TreeSet;
public class Main {
	public static void main(String[] args) {
		TreeSet<String> Japanese = new TreeSet<String>();
		
		Japanese.add("ああ");
		Japanese.add("たた");
		Japanese.add("わわ");
		Japanese.add("七");
		Japanese.add("カカ");
		Japanese.add("ママ");
		Japanese.add("笹");
		Japanese.add("ララ");
		Japanese.add("はは");
		for (String string : Japanese)
			System.out.println(string);
		
		System.out.println("---------");
		Japanese.remove("はは");
		Japanese.remove("ララ");
		Japanese.add("八");
		Japanese.add("七ノ位");
		Japanese.add("七の位");
		Japanese.add("六");
		Japanese.add("わ");
		for(String string2 : Japanese)
			System.out.println(string2);
		
		//並び順の考察
		//表示される並び順は，
		//ひらがな，カタカナ，漢字の優先順位で50音順に並べ替えられる．
		//最初の文字が同じ文字の場合は，2文字目を比較し，次に3文字目と繰り返して比較している．
		//ひらがな，カタカナ，漢字を混ぜた場合も優先順位は変わらない
		//また，文字数が少ない順に並べられる．
	}
}
	

