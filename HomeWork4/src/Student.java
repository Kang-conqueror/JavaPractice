public class Student implements Table{

    public String ID;
    public String NAME;
    public String GENDER;
    public String AGE;

    public Student(String ID, String NAME, String GENDER, String AGE){

        this.ID = ID;
        this.NAME = NAME;
        this.GENDER = GENDER;
        this.AGE = AGE;
    }

    @Override
    public void printStudents(){


        System.out.printf("%-" + columnWidths[0] + "s", ID);
        System.out.printf("%-" + columnWidths[1] + "s", NAME);
        System.out.printf("%-" + columnWidths[2] + "s", GENDER);
        System.out.printf("%-" + columnWidths[3] + "s", AGE);
        System.out.println();

    }

}
