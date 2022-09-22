package Task2Pdf2;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemSolving {
	
	  
	  //Scanner inn=new Scanner(System.in);
	public static void main(String[] args) {
		
		//program1();
		//program6();
		//program2();
		//program33();
		program4();  
		//program5();
		
	}
	
	static void program1() {  
		String Sentence= "i.like.very.much";
		//String Sen2="";
		
		char[] A=Sentence.toCharArray();
		
		int n=A.length;
		int count =0;
		for(int i=n-1;i>=0;i--) {
			if(A[i]!='.') {
				count++;
			}
			else {
				for(int j=i+1;j<i+count+1;j++) {
					System.out.print(A[j]);
					//Sen2+=A[j];
				}
				System.out.print(".");
				count=0;
			}
		}
		for(int i=0;i<n;i++) {
			if(A[i]!='.') {
				System.out.print(A[i]);
				//Sen2+=A[i];
			}
			else {
				break;
			}
		}
		
		
		
	}

	static void program2() {
		
		String Sentence = "AbcdEfghijklmnopqrstuvwxyz";
		
		
		String Sen2 = "abcdefghijklmnopqrstuvwxyz";
		char A[] = Sentence.toCharArray();
		char B[] = Sen2.toCharArray();
		int n1=A.length;
		int n2=B.length;
		//ALGORITHM:
		
		for(int i=0;i<n1;i++) {
			
			int temp=(int)A[i];
			
			//CAPTIAL TO SMALL
			if(A[i]>='A' && A[i]<='Z') {
				temp=temp+32;
				A[i]=(char)temp;
			}
			
			//char ctemp=(char)temp;
			for(int j=0;j<n2;j++) {
				if(temp==B[j]) {
					B[j]=0;
					break;
				}
					
			}
		}
		//Result:
		
		boolean flag=true;
		
		for(int i=0;i<n2;i++) {
			if(B[i] !=0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("Panagaram");
		}
		else {
			System.out.println("Not panagram");
		}
 		
	}
	static void program3() { 
		
		
		/*  Input :  a m a z o n
		 * 			 n a m a z o
		 * Output :  o n a m a z
		*/
		Scanner in=new Scanner(System.in);
		
		int k=2;
		System.out.print("Enter String 1  : ");
		String Sen1=in.next();
		//String Sen1="mani";
		System.out.print("Enter String 2  :  ");
		String Sen2=in.next();
		//String Sen2="nima";
		char A[]=Sen1.toCharArray();
		int n=A.length;
		
		while(k>0) {
			//System.out.println(Arrays.toString(A));
			char temp=A[n-1];
			for(int i=n-1;i>0;i--) {
				A[i]=A[i-1];
			}
			A[0]=temp;
			k--;
			//System.out.println(Arrays.toString(A));
		}
		//System.out.println(Arrays.toString(A));
		String Sen3=String.valueOf(A);
		//System.out.println("Check sen3 : " + Sen3);
		//System.out.println("Check  sen 2: " + Sen2);
		//Checking
		
		
		if(Sen3.equals(Sen2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
	}
	
	static void program33() { 
		
		
		/*  Input :  a m a z o n
		 * 			 n a m a z o
		 * Output :  o n a m a z
		*/
		Scanner in=new Scanner(System.in);
		
		int k=2;
		System.out.print("Enter String 1  : ");
		String Sen1=in.next();
		//String Sen1="mani";
		System.out.print("Enter String 2  :  ");
		String Sen2=in.next();
		//String Sen2="nima";
		char A[]=Sen1.toCharArray();
		int n=A.length;
		
		while(k>0) {
			//System.out.println(Arrays.toString(A));
			char temp=A[0];
			for(int i=0;i<n-1;i++) {
				A[i]=A[i+1];
			}
			A[n-1]=temp;
			k--;
			//System.out.println(Arrays.toString(A));
		}
		//System.out.println(Arrays.toString(A));
		String Sen3=String.valueOf(A);
		//System.out.println("Check sen3 : " + Sen3);
		//System.out.println("Check  sen 2: " + Sen2);
		//Checking
		
		
		if(Sen3.equals(Sen2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
	}
	static void program4() {  
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter n value : ");
		//int n=in.nextInt();
		int A[]= {1,-1,3,2,-7,-5,11,6};
		int n=A.length;
		for(int i=0;i<n;i++) {
			if(!(A[i]>=0)) {
				int temp=A[i];
				for(int j=i;j<n-1;j++) {
					A[j]=A[j+1];
				}
				A[n-1]=temp;
				//if(!(A[i]>=0)) {
				//	i--;
			//	}
			}
			
		}
		
		//Print Statement:
		for(int i=0;i<n;i++) {
			System.out.print(A[i] + " ");
		}
	}
	static void program5() { 
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = in.nextInt();
		int A[] = new int[n];
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
		}
		
//		int A[] = {0,2,0,1,2};
//		int n = A.length;
		int flag=0;
		for(int k=0;k<n;k++) {
			if(!(A[k]==0 || A[k]==1 || A[k]==2)) {
//				flag++;
//				break;
				System.out.println("Invaild Number");
			}else {
				for(int i=0;i<n-1;i++) {
					for(int j=i+1;j<n;j++) {
						if(A[i]>A[j]) {
							
							int temp=A[i];
							A[i]=A[j];
							A[j]=temp;
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(A));
//		if(flag!=0) {
//			System.out.println("Invaild Number");
//		}
//		else {
//			for(int i=0;i<n-1;i++) {
//				for(int j=i+1;j<n;j++) {
//					if(A[i]>A[j]) {
//						
//						int temp=A[i];
//						A[i]=A[j];
//						A[j]=temp;
//					}
//				}
//			}
//		}
	//System.out.println(Arrays.toString(A));
	}
	
	

	static void program6() { 
		//Find min and Max
		Scanner in=new Scanner(System.in);
		System.out.println("Enter N Valude : ");
		int n =in.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
		}
		//ALGORITHM:
		int flag=0;
		int min=0;
		int max=0;
		for(int i=0;i<n;i++) {
			if(flag==0) {
				min=A[i];
				max=A[i];
				flag++;
			}
			if(max < A[i]) {
				max=A[i];
				
			}
			if(min > A[i]) {
				min=A[i];
			}
		}
		System.out.println("Min : " + min);
		System.out.println("Max : " + max);
		
		/*for(int i=0;i<n;i++) {
			System.out.println(A[i]);
		}*/
		
	}

}
