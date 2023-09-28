import java.util.Scanner;
public class StudentGradeCal {
    public static void main(String args[]){
    
        int count,i;
        float toatkMarks=0,percentage,avg;

        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Enter Number of Subject  : ");

        count=scanner.nextInt();

        System.out.println("Enter Marks of "+count+"subject");

        // percentage and Totalmarks and total obt marks

        for(i=0;i<count;i++){
            toatkMarks+=scanner.nextInt();
        }
        avg=toatkMarks/count;

        percentage=(toatkMarks/(count*100))*100;
        System.out.println("Total obtained Marks : "+ toatkMarks);

        System.out.println("percentage : "+percentage);

        System.out.println(" Total Marks : " +count*100);

        // cal avg 

        avg=toatkMarks/i;
        
        System.out.println("The student grade is : ");

        if(avg>=90){

            System.out.println("O");
        }else if(avg>=80){

            System.out.println("A");
        }else if(avg>=70){

            System.out.println("B");
        }else if(avg>=60){

            System.out.println("C");
        }else if(avg>=50){

            System.out.println("C");
        }else if(avg>=40){

            System.out.println("D");
        }else {

            System.out.println("F");
        }
             
    }
    
    
}
