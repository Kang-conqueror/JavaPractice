import java.util.Arrays;

public class StringArray implements Table {


    public int studentLength = Main.sourceInfo.length;
    public int infoLength = 4;

    public String[][] Students = new String[studentLength][infoLength];


    public void getSource(String[][] sourceInfo){
        Students = Arrays.copyOf(sourceInfo, sourceInfo.length);
    }


    @Override
    public void printStudents(){

        for (int i = 0; i < studentLength; i++){

            for (int j = 0; j < infoLength; j++){

                System.out.printf("%-" + columnWidths[j] + "s", Students[i][j]);

            }

            System.out.println();
        }



    }

}
