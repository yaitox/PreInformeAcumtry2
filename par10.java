package packag.e;

public class par10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=30;i++) {
			if(i%2==0 && i<=20)
				System.out.println("es par "+i);
		
		else if( i%2==0 && i>20)
			System.out.println("no se contaron los pares: "+i+" ya que solo son los diez primeros pares");
		}
		}

}
