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

    @Override
    public void print(){
        super.print();

        String input = super.scanner.nextLine();

        if (Check(input.toCharArray())){
            System.out.println("恭喜，大对了！");
        }

        else{
            System.out.println("还得努力呀！");
        }
    }

}
