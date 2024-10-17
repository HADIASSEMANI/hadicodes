import javax.swing.plaf.multi.MultiInternalFrameUI;

public class DriverClass {
    public static void main(String[] args){
        MusicalNote note1 = new MusicalNote(1,6);
        MusicalNote note2 = new MusicalNote(1, 5);
        MusicalNote note3 = new MusicalNote(1, 7);
        note1.shorten(15);
        System.out.println(note1.getDuration());
        System.out.println(note1.toString());
        if (note1.getDuration()>note2.getDuration()){
            System.out.println("note1 is longer");
        } else if (note1.getDuration()< note2.getDuration()) {
            System.out.println("note2 is longer");
        } else {
            System.out.println("They have the same length");
        }
        boolean isTrue = note2.equals(note3);
        System.out.println(isTrue);
    }
}
