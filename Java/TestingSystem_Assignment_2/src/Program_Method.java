
public class Program_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Program_Method program_method = new Program_Method();
//		program_method.gotoSchool();
//		System.out.println(program_method.tinhtong(1, 2));

		nguyenduong();
		//System.out.println(tinhtong(1, 2));

	}

	static void nguyenduong() {
		for (int l = 1; l < 10; l++) {
			if (l % 2 == 0)
				System.out.println(l);
		}
	}
	static void gotoSchool() {
		System.out.println("goToSchool ...");
	}

	static int tinhtong(int sothu1, int sothu2) {
		return sothu1 + sothu2;
	}
}
