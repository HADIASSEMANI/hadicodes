public class Player {
    private String color;
    private int position;
    //default constructor
    public Player(){}
    //copy constructor
    public Player(String color, int position){
        this.color = color;
        this.position = position;
    }
    public boolean equals(Player player){
        return this.position==player.position;
    }
}
