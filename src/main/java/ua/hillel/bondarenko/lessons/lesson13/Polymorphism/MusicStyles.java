package ua.hillel.bondarenko.lessons.lesson13.Polymorphism;


public abstract class MusicStyles {

    private String name;

    public MusicStyles(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void playMusic(MusicStyles musicStyles) {
    }

    public abstract void playMusic(MusicStyles musicStyles);
}
