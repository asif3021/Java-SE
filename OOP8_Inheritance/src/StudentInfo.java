public class StudentInfo extends CandidateInfo{
    int roll = 18;
    int c = 4;

    void displayStudentInfo(){
        System.out.println("Roll : " + this.roll);
        System.out.println("Class : " + this.c);
        displayCandidateInfo();
    }


}
