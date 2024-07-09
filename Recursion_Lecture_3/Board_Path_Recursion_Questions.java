package Recursion_Lecture_3;
public class Board_Path_Recursion_Questions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=4;
        BoardPath(n,0,"");
	}
	public static void BoardPath(int n,int curr,String ans) {
		if(curr==n) {
			System.out.print(ans+" ");
			return;
		}
		if(curr>n) {
			return;
		}
		BoardPath(n,curr+1,ans+1);
		BoardPath(n,curr+2,ans+2);
		BoardPath(n,curr+3,ans+3);
	}
}