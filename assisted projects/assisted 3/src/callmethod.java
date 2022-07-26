public class callmethod {
	public int Multiply(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		callmethod b=new callmethod();
		int ans= b.Multiply(7,5);
		System.out.println("Multipilcation is :"+ans);
		}


}


