public class SingleQuestion extends Question {

    char answer;

    public SingleQuestion(){


    }

    public SingleQuestion(String text, String[] options, char answer){
        super(text, options);
        this.answer = answer;
    }


    public boolean Check(char answers){

        return answers == answer || Character.toUpperCase(answers) == answer;
    }

    @Override
    public void print(){
        super.print();
        String input = super.scanner.nextLine();

        if (Check(input.toCharArray()[0])){
            System.out.println("恭喜，大对了！");
        }

        else {
            System.out.println("还得努力呀！");
        }
    }

}
