package Lesson01;

public class Badger extends Pet implements Talkable {
    private boolean Mascot;

    public Badger(boolean Mascot, String name) {
        super(name);
        this.Mascot = Mascot;
    }

    public boolean isMascot() {
        return Mascot;
    }

    @Override
    public String talk() {
        return "Bork";
    }

    @Override
    public String toString() {
        return "Badger: " + "name=" + name + " Mascot=" + Mascot;
    }
}
