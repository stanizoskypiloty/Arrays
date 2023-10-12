import java.util.Scanner;

public class Triil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input=new Scanner(System.in);
	int[] total=new int[4];
		String[] name=new String[4];
		int[] roll=new int[4];
		int marks [][] =new int[4][3];
		String result[]=new String[4];
		int average[]=new int[4];
	
		String grade;
		
		for(int i=0;i<=3;i++) {
			System.out.println("Enter Student's roll number:");
			roll[i]=input.nextInt();
			System.out.println("Enter the student's name:");
			name[i]=input.next();
			System.out.println("Enter the marks:");
			
		for(int j=0;j<1;j++) {
			for(int k=0;k<3;k++) {
				marks[i][k]=input.nextInt();
				if(marks[i][k]>50) {
					result[i]="P";
				}
				else {
					result[i]="F";
				}
				
				
				
			}
			
			
		}
		total[i]=marks[i][0]+marks[i][1]+marks[i][2];
		average[i]=total[i]/3;
		if((average[i]>=70) && (average[i]<=100)) {
			grade="A";
		}
		else if ((average[i]>=50) && (average[i]<=69)) {
			grade="B";
		}
		else if((average[i]>=0) && (average[i]<=49)) {
			grade="c";
		}
		else {
			grade="Invalid";
		}
		
		}
		
	
		
		
		
		
			System.out.println("**************************************************************");
			System.out.println("\t\t\tSTUDENT MARKLIST");
			System.out.println("**************************************************************");
			System.out.println("ROLL\tNAME\t MARK1 MARK2 MARK3  TOTAL RESULT AVERAGE GRADE ");
		
			
			for(int i=0;i<=3;i++) {
				System.out.print(roll[i]+"\t"+name[i]);
				for(int j=0;j<1;j++) {
					for(int k=0;k<3;k++) {
						System.out.print("\t"+marks[i][k]);
						
						
					
					}
					System.out.print("\t"+total[i]);
					System.out.print(" "+result[i]);
					System.out.print("\t"+average[i]);
					System.out.print("\tA");
					
					
					System.out.println("");
				}
			}
			
		
			
	
			
		
	
		
		/*
		
System.out.println("**************************************************************");
System.out.println("\t\t\tSTUDENT MARKLIST");
System.out.println("**************************************************************");
System.out.println("ROLL\tNAME\t MARK1 MARK2 MARK3  TOTAL RESULT AVERAGE GRADE ");

for(i=0;i<=3;i++) {
	System.out.print(roll[i]+"\t"+name[i]);
	for(j=0;j<=2;j++) {
		System.out.print("\t"+marks[j]);
		
	}
	System.out.print("\t");
	System.out.print("\tP");
	
	System.out.println("");
}
*/
	}
	
}

