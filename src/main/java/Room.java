import java.util.ArrayList;
import java.util.Collections;

public class Room {
    private ArrayList<Exit> exits;

    public Room() {
        this.exits = new ArrayList<Exit>();
    }

    public ArrayList<Exit> getExits() {
        return exits;
    }

    public void setExits(ArrayList<Exit> exits) {
        this.exits = exits;
    }

//    public Exit randomExit(){
//        ArrayList<Exit> shuffled = Collections.shuffle(exits);
//        return shuffled.get(0);
//    }
}
