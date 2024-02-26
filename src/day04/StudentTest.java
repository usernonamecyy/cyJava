package day04;

public class StudentTest {
    public static void main(String[] args) {
        //创建Student[]
        Student[] student = new  Student[20];
        //Student stu = new Student();
        for (int i =0;i<student.length;i++){
            student[i] = new Student();
            student[i].number = i+1;
            student[i].grade = (int)(Math.random()*101);


        }
        for(int i =0;i<student.length;i++){
            if(3==student[i].state){
                Student stu = student[i];
                System.out.println(stu.state);
            }
        }
    }
}
