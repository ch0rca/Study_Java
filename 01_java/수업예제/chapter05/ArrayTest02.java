package chapter05;

public class ArrayTest02 {
	public static void main(String[] args) {
		String[] names = { "강소연","권순국","김경규","김동훈","김민경"};
		int[] java= {95,90,98,96,95};
		int[] db=   {95,100,90,93,90};
		int[] spring= {90,9,100,97,100};
		int[] total = new int[names.length];
		double[] avg = new double[names.length];
		double num =3;
		System.out.println("===============================================");
		System.out.println("이름\t자바\t디비\tspring\t총점\t평균");
		System.out.println("===============================================");
		for (int i = 0, size = names.length; i < size; i++) {
			total[i] = java[i]+db[i]+spring[i];
			avg[i] = total[i]/num;
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n"
							,names[i], java[i] ,db[i] ,spring[i] ,total[i] ,avg[i]);
		}
		
	}
}






