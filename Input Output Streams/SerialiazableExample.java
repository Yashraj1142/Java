import java.io.Serializable;

public class SerialiazableExample implements Serializable{
    int id;
    String name;

    public SerialiazableExample(int id, String name){
        this.id = id;
        this.name = name;
    }
}
