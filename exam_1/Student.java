public class Student {
    String surname;
    String firstname;
    char middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    Boolean iAmAwesome;


        public void sayMyStudentNumber() {
            System.out.println("My Student Number: "+studentNumber);
            
        }
        public void sayMyEmailAddress() {
            System.out.println("My Student Email Address: "+studentEmailAddress);
        }
        public void amIAwesome(){
            System.out.println("Am i awesome?: "+iAmAwesome);
        }

public Student(String SN, String FN, char MI, String dOB, int sNUM, String sEmail, Boolean FACT) {
    surname = SN;
    firstname = FN;
    middleInitial = MI;
    dateOfBirth = dOB;
    studentNumber = sNUM;
    studentEmailAddress = sEmail;
    iAmAwesome = FACT;


    
}
}
