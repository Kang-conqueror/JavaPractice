import java.io.*;

public class Main {


    public static void main(String[] args){

        //각 Class 생성 후에,
        Question multiQuestion = new MultiQuestion("三国演义中的三绝是谁?", new String[]{"A.曹操", "B.刘备", "C关羽", "D.诸葛亮"}, new char[]{'a', 'c', 'd', 'A', 'C', 'D'});

        Question singleQuestion = new SingleQuestion("最早向刘备推荐诸葛亮的是谁?", new String[]{"A.徐庶", "B.司马徽", "C.鲁肃", "D.关羽"}, 'D');

        multiQuestion.print();
        singleQuestion.print();

    }



}
