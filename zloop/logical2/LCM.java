package in.dsa.zloop.logical2;

public class LCM{

	public static void main(String[] args){

		LCM L= new LCM();
		int gettingLcm = L.getLcm(10, 20);
		System.out.println(gettingLcm);
}


	public int getLcm(int a, int b){

		int gdc = 1;

		for(int i=1; i<=a && i<=b; i++){
			if(a%i==0 && b%i==0){
				gdc=i;
            }
		}


		int lcm = (a*b)/gdc;
		return lcm;
}

}