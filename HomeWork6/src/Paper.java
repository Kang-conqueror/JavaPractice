import java.util.HashMap;
import java.util.Map;

public class Paper {

    public Map<Integer, Question> questions = new HashMap<>();

    public int count;

    public Paper(){

    }

    public Paper(int count){
        this.count = count;
    }

    public void addQuestions(int index){

        this.questions.put(index, new Question());


    }

    public Map<Integer, Question> getQuestions(){

        return this.questions;
    }

    public int getCount(){
        return this.count;
    }

    public void showPaper(){

        for (int i = 1; i < count + 1; i++){
            this.questions.get(i).showQuestion();
        }

    }

}
