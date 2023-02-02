public class MusicalNote {
    int syllable = 1;
    int duration = 1;

    MusicalNote(){}

    MusicalNote(int syllable, int duration){
        setSyllable(syllable);
        setDuration(duration);
    }
    public void setSyllable(int syllable){
        if (syllable<7 && syllable>1){
            this.syllable=syllable;
        } else {
            this.syllable=1;
        }
    }
    public void setDuration(int duration){
        if (duration<0) {
            this.duration=1;
        } else{
            this.duration=duration;
        }
    }
    public int getSyllable(){
        return syllable;
    }
    public int getDuration(){
        return duration;
    }
    public void shorten(int input){
        if (this.duration-input<=0){
            this.duration=1;
        } else{
            this.duration-= input;
        }
    }
    public String toString(){
        String syllables = "";
        switch(syllable){
            case 1:
                syllables = "DO";
                break;
            case 2:
                syllables = "RE";
                break;
            case 3:
                syllables = "MI";
                break;
            case 4:
                syllables = "FA";
                break;
            case 5:
                syllables = "SOL";
                break;
            case 6:
                syllables = "LA";
                break;
            case 7:
                syllables = "SI";
                break;
        }
        return syllables + "-" + duration;
    }
    public boolean sameSyllable(MusicalNote a){
        boolean state;
        if (a.getSyllable()==this.getSyllable()){
            state = true;
        } else{
            state = false;
        }
        return state;
    }
    public boolean equals(MusicalNote a){
        boolean state;
        if (a.getSyllable()==this.getSyllable() && a.getDuration()==this.getDuration()){
            state = true;
        }else{
            state=false;
        }
        return state;
    }
}
