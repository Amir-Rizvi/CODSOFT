package CODSOFT;

 import java.util.*;
 public class task2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int totalMarks=0;
        System.out.println("enter total subjects");
        int totalSubject=sc.nextInt();
        for(int i=1;i<=totalSubject;i++){
            System.out.println("enter the marks of subject "+i);
            totalMarks+=sc.nextInt();
        }
        int percentage=totalMarks/totalSubject;
        if(percentage>=90){
            System.out.println("totalMarks is: "+totalMarks);
            System.out.println("totalPercentage is: "+percentage+"%");
            System.out.println("Grade A+");
        }
        else if(percentage>=80 && percentage<90){
            System.out.println("totalMarks is: "+totalMarks);
            System.out.println("totalPercentage is: "+percentage+"%");
             System.out.println("Grade A");
        }
        else if(percentage>=70 && percentage<80){
            System.out.println("totalMarks is: "+totalMarks);
            System.out.println("totalPercentage is: "+percentage+"%");
            System.out.println("Grade B+");
        }
        else if(percentage>=60 && percentage<70){
            System.out.println("totalMarks is: "+totalMarks);
            System.out.println("totalPercentage is: "+percentage+"%");
            System.out.println("Grade B");
        } 
        else if(percentage>=50 && percentage<60){
            System.out.println("totalMarks is: "+totalMarks);
            System.out.println("totalPercentage is: "+percentage+"%");
            System.out.println("Grade C");
        }   
        else if(percentage>=40&& percentage<50){
            System.out.println("totalMarks is: "+totalMarks);
            System.out.println("totalPercentage is: "+percentage+"%");
            System.out.println("Grade D");
        }  
        else{
            System.out.println("totalMarks is: "+totalMarks);
            System.out.println("totalPercentage is: "+percentage+"%");
             System.out.println("Grade E");
        } 
        sc.close();      
    }
}
