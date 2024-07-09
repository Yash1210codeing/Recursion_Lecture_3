package Recursion_Lecture_3;
public class Sub_sequency_Count_Recursion_Questions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ques="abc";
        PrintSubSeqnue(ques,"");
        System.out.println(count);
	}
	static int count=0;
	public static void PrintSubSeqnue(String ques,String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		char ch=ques.charAt(0);
		PrintSubSeqnue(ques.substring(1),ans);
		PrintSubSeqnue(ques.substring(1),ans+ch);
	}
}
