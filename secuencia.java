package packag.e;

public class secuencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
num=1;
int sec=1;
		while(num<100) {
			System.out.println(num);
			num=num+sec;
			sec=sec+1;
			if(sec>5)
				sec=1;
		}
	}
	

}
