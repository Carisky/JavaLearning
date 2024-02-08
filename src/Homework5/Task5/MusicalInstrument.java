package src.Homework5.Task5;

class MusicalInstrument {
    String name;
    String type;

    public MusicalInstrument(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void sound() {
        System.out.println(name + " produces a musical sound.");
    }

    public void show() {
        System.out.println("Musical Instrument: " + name);
    }

    public void desc() {
        System.out.println("This is a " + type + " called " + name + ".");
    }

    public void history() {
        System.out.println(name + " has a rich history of musical tradition.");
    }
}

