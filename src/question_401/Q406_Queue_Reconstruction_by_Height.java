package question_401;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q406_Queue_Reconstruction_by_Height {
	public int[][] reconstructQueue(int[][] people) {

//		print(people);
		Arrays.sort(people, (p1, p2)-> p1[0]==p2[0]? p1[1]-p2[1]: p2[0]-p1[0] );
		
//		Arrays.sort(people,new Comparator<int[]>(){
//	           @Override
//	           public int compare(int[] o1, int[] o2){
//	               return o1[0]!=o2[0]?-o1[0]+o2[0]:o1[1]-o2[1];
//	           }
//	        });
		
//		print(people);
		
		List<int[]> list = new ArrayList<>();
		list.add(people[0]);
		
		for(int i =1; i< people.length; i++) {
			list.add(people[i][1], people[i]);
			printList(list);
//			System.out.println();
		}

		int[][] arr = list.toArray(new int[list.size()][2]);
//		System.out.println();
		print(arr);
		return list.toArray(new int[list.size()][2]);
	}

	public void printList(List<int[]> list){
		
		for(int i =0; i< list.size(); i++){
			System.out.print(Arrays.toString(list.get(i))+"");
		}	
		
	}
	
	public void print(int[][] people) {
		for (int[] p : people) {
			System.out.print("(" + p[0] + "," + p[1] + ")");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[][] people = { { 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 } };
		Q406_Queue_Reconstruction_by_Height q = new Q406_Queue_Reconstruction_by_Height();
		q.reconstructQueue(people);
	}
}
