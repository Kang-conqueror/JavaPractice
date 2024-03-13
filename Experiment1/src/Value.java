//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Value {

    String x;
    Double y;

    @Override
    public boolean equals(Object o)  {

        if(!(o instanceof Value)){
            return false;
        }

        Value v = (Value) o;

        return v.x == this.x && v.y == this.y;
    }


}
