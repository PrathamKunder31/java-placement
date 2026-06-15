import java.util.Scanner;
public class student {
        String name;
        String rollno;
        int marks;

        student(String name, String rollno, int marks) {
            this.name=name;
            this.rollno=rollno;
            this.marks=marks;
        }
        void display() {
            System.out.println("name:"+name);
            System.out.println("rollno:"+rollno);
            System.out.println("marks:"+marks);
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of the student");
            int n = sc.nextInt();
            student[] students = new student[n];
            for(int i=0;i<n;i++){
                System.out.println("enter the name of the student");
                String name = sc.next();
                System.out.println("enter the roll no of the student");
                String rollno = sc.next();
                System.out.println("enter the marks of the student");
                int marks = sc.nextInt();
                students[i] = new student(name, rollno, marks);
            }
            System.out.println("display all the students details:");
            for(int i=0;i<n;i++){

                
                students[i].display();
            }
            sc.close();
        }
    }
