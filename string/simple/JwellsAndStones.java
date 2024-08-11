package in.dsa.string.simple;


public class JwellsAndStones {

	public static void main(String[] args) {

		int countJwells = jwells("aA", "aAAbbbb");
		System.out.println(countJwells);
	}
	
	public static int jwells(String jwells , String stones){
		
		int count = 0;
		for(char stone : stones.toCharArray())
			if(jwells.contains(stone + "")) count++;
		
		return count;
	}

}
