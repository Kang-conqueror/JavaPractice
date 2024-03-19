public class MultiQuestion extends Question{

    char[] answer;

    public MultiQuestion(){

    }

    public MultiQuestion(String text, String[] options, char[] answer){
        super(text, options);
        this.answer = answer;
    }

    public boolean Check(char[] answers){

        int answerCount = 0;


        for (char c : answer) {

            for (char value : answers) {

                if (value == c) {

                    answerCount++;
                    break;
                }
            }

        }

        return answerCount == answer.length / 2;
    }

    int[] a = new int[]{};

}
