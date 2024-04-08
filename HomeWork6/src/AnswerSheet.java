import java.util.HashMap;
import java.util.Map;

public class AnswerSheet {

    public Map<Integer, String> answers = new HashMap<>();

    public AnswerSheet(){

    }

    public void addAnswer(int key, String answer){

        answers.put(key, answer);

    }

    public Map<Integer, String> getAnswers(){

        return this.answers;

    }



}
