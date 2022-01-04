package misc;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o =new Float(23);
		Object[] oa = new Object[1];
		oa[0] = o;
		o =null;
		System.out.println(o);
		System.out.println(oa[0]);
	}

}
