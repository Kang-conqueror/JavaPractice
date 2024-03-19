public class SingleQuestion extends Question {

    char answer;

    public SingleQuestion(){


    }

    public SingleQuestion(String text, String[] options, char answer){
        super(text, options);
        this.answer = answer;
    }


    public boolean Check(char answers){

        return answers == answer;
    }


}
