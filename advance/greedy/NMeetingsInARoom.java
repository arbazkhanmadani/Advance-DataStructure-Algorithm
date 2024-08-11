package in.dsa.advance.greedy;

import java.util.Arrays;
import java.util.Comparator;

class Meeting{
	
	int start = 0;
	int finish = 0;
	public Meeting(int s, int f){
		this.start = s;
		this.finish = f;
	}
}

public class NMeetingsInARoom{

	public static void main(String[] args){
		
		int s[] = {1,3,0,5,8,5};
		int e[] = {2,4,6,7,9,9};
		
		maxMeetingInRoom(s,e);
	}

	public static void maxMeetingInRoom(int[]s, int[]e){
	
		Meeting a = null;
		Meeting meetingArr[] = new Meeting[s.length]; 
		
		for(int i = 0; i<s.length; i++){
			a = new Meeting(s[i], e[i]);
			meetingArr[i] = a;
		}
		
		Comparator<Meeting> comp = (Meeting m1,Meeting m2)->m1.finish-m2.finish;
		Arrays.sort(meetingArr, comp);
		
		//for(int i = 0; i<meetingArr.length; i++)
		//System.out.println(meetingArr[i].start+","+meetingArr[i].finish+")");
			
		
		//i -> startTime : j -> endTime
		
		int j = 0;
		//At least one meeting can be done in any case - even all the above meeting not satisfy condition. 
        System.out.println("(" + meetingArr[0].start + "," + meetingArr[0].finish + ")");
		for(int i = 1; i<meetingArr.length; i++){
			
			if(meetingArr[i].start >= meetingArr[j].finish){
				System.out.println("("+meetingArr[i].start+","+meetingArr[i].finish+")");
			j=i;
			}
		}
	}
}
