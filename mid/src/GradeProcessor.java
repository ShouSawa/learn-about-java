import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class GradeProcessor{
	private String score;
	private String setting;
	private String result;
	
	public GradeProcessor(String score, String setting,String result) {
		this.score = score;
		this.setting = setting;
		this.result = result;
	}
	
	public void process(){
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(setting)));
			String s = br.readLine();
			boolean sum = false;
			boolean min = false;
			boolean max = false;
			while(s != null) {
				if(s.contains("sum") && s.contains("yes")) {
					sum = true;
				}else if(s.contains("min") && s.contains("yes")) {
					min = true;
				}else if(s.contains("max") && s.contains("yes")){
					max = true;
				}
				s = br.readLine();
			}//設定ファイルの指標の有無を確認する
			

			br = new BufferedReader(new FileReader(new File(score)));
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(result)));
			s = br.readLine();
			bw.write(s);

			if(sum)
				bw.write(",Sum");
			if(min)
				bw.write(",Min");
			if(max)
				bw.write(",Max");
			bw.flush();
			bw.newLine();
			s = br.readLine();
			while(s != null) {
				bw.write(s);
				String[] data = split(s);//行内の数値を文字列として取得
				if(sum) 
					bw.write(getSum(data));//合計値を計算
				if(min)
					bw.write(getMin(data));//最小値
				
				if(max)
					bw.write(getMax(data));//最大値
				bw.flush();
				bw.newLine();
				s = br.readLine();
			}
			
			br.close();
			bw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String[] split(String s) {//行内の数値を配列として取得するメソッド
		String[] array = s.split(",");
		array[0] = null;
		return array;
	}
	private String getSum(String[] s) {//配列内の数値の合計値を返すメソッド
		int sum = 0;
		for (int i = 1; i < s.length; i++) {
			sum += Integer.parseInt(s[i]);//String型からint型へキャスト
		}
		String m = String.valueOf(sum);
		return "," + m;
	}
	private String getMin(String[] s) {//配列内の数値の合計値を返すメソッド
		int min = Integer.parseInt(s[1]);
		for(int i = 2; i < s.length; i++) {
			if(Integer.parseInt(s[i]) < min)
				min = Integer.parseInt(s[i]);
		}
		String m = String.valueOf(min);
		return "," + m;
	}
	private String getMax(String[] s) {//配列内の数値の合計値を返すメソッド
		int max = Integer.parseInt(s[1]);
		for(int i = 2; i < s.length; i++) {
			if(Integer.parseInt(s[i]) > max)
				max = Integer.parseInt(s[i]);
		}
		String m = String.valueOf(max);
		return "," + m;
	}
}
