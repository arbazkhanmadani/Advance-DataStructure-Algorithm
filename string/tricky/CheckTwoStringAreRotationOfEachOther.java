package in.dsa.string.tricky;

public class CheckTwoStringAreRotationOfEachOther {

	public static void main(String[] args){
		
		if(checkRotation("ABCD", "BCDA"))
			System.out.println("Rotation of eachother.....");
		else
			System.out.println("Not rotation of eachother.....");
	}
	
	
	public static boolean checkRotation(String s1, String s2){
	
		//s1.length()==s2.length() -> Str must be of same length......
		if(s1.length()!=s2.length()) return false;
		
		//s1+s2 => ABCD ABCD  -> s1=BCDA is subStr of -> s1+s2........
		//(s1+s2).indexOf(s2)!=-1  -> means s1+s1 => contains s2......
		return (s1+s2).indexOf(s2)!=-1;
	}
	
}
