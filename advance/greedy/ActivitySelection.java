package in.dsa.advance.greedy;

import java.util.Arrays;
import java.util.Comparator;

class Activity{
	
	int start = 0;
	int finish = 0;
	public Activity(int s, int f){
		this.start = s;
		this.finish = f;
	}
}

public class ActivitySelection {

	public static void main(String[] args){

		int s[] = {5,1,3,0,5,8};
		int e[] = {9,2,4,6,7,9};
		
		selectActivity(s,e);
		
	}

	
	public static void selectActivity(int[] start, int[] end){
	
		Activity a = null;
		Activity activityArr[] = new Activity[start.length]; 
		
		for(int i = 0; i<start.length; i++){
			a = new Activity(start[i], end[i]);
			activityArr[i] = a;
		}
		
		Comparator<Activity> comp = (Activity s1,Activity s2)->s1.finish-s2.finish;
		Arrays.sort(activityArr, comp);
		
		System.out.println("Start - "+ activityArr[0].start +" : Finish - "+activityArr[0].finish);
		int j = 0;
		for(int i = 1; i<start.length; i++){
			
			//System.out.println("Start - "+activityArr[i].start+" : Finsih - "+activityArr[i].finish);
			if(activityArr[i].start>=activityArr[j].finish){
				
				System.out.println("Start - "+activityArr[i].start+" : Finsih - "+activityArr[i].finish);
				j=i;
			}
		}
	}
	
	
}
