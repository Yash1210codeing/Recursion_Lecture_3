package Recursion_Lecture_3;
public class Sub_sequency_Count_Recursion_Questions_Method_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="abc";
		System.out.println("\n"+PrintSubSeqnue(ques,""));
	}
	public static int PrintSubSeqnue(String ques,String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return 1;
		}
		char ch=ques.charAt(0);
		int a1=PrintSubSeqnue(ques.substring(1),ans);
		int b1=PrintSubSeqnue(ques.substring(1),ans+ch);
		return a1+b1;
	}
}

