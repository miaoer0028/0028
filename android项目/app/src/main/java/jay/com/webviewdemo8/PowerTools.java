/**
 * 
 */
package jay.com.webviewdemo8;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @作者_魔秀字符君

*  @大乐透安卓版5位

 * @下拉刷新随机选号
 */
public class PowerTools {

	/**
	 * get random two color ball numbers
	 * 
	 * @return
	 */
	public static String getRandom2ColorBall() {
		
		String res = "";
		
		List<Integer> resArr = new ArrayList<Integer>();


int x= (int) Math.round(Math.random()*11+0); 



		
		for (int i = 0; i < x; i++) {

			// get random int 1~35
			int number = new Random().nextInt(35) + 1;
			
			while (resArr.contains(number)) {
				number = new Random().  nextInt(35) + 1;
			}
			
			resArr.add(number);
			
		}
		
		Collections.sort(resArr);
		
		res += resArr.toString();
		res = res.replace(",", " ");
		res += " | [";
		res += new Random().nextInt(13) + 0;

        res +="+";

	res += new Random().nextInt(13) + 0;


        res +="+";



	res += new Random().nextInt(13) + 0;



        res +="+";




	res += new Random().nextInt(13) + 0;
		res += "] |";
		return res;
	}
}
