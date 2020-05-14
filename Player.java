import java.util.ArrayList;

public class Player
{
    private String name;
    private int life;
    private int graveyard;
    private int selector;
    private boolean tBlock;
    private boolean aBlock;
    private boolean bBlock;
    private ArrayList<Card> deck;
    private ArrayList<Card> hand;
    private ArrayList<Card> transfer = new ArrayList<Card>();
    
    public Player(String name){
        this.name = name;
        life = 10;
        deck = new ArrayList<Card>(27);
        hand = new ArrayList<Card>(27);
        graveyard = 0;
        tBlock = false;
        aBlock = false;
        bBlock = false;
    }
    
    public void set(){}
    public void get(){}
    
    public void setName(String name){this.name = name;}
    public void setLife(int life){this.life = life;}
    public void setGraveyard(){graveyard++;}
    
    public String getName(){return name;}
    public int getLife(){return life;}
    public ArrayList<Card> getDeck(){return deck;}
    public int getDeckSize(){return deck.size();}
    public Card getDeckCard(int i){return deck.get(i);}
    public ArrayList<Card> getHand(){return hand;}
    public int getHandSize(){return hand.size();}
    public Card getHandCard(int i){return hand.get(i);}
    
    
    public void drawCard(Player target){
           selector = (int)Math.random()*27;
           (target.getHand()).add((target.getDeck()).get(selector));
           (target.getDeck()).remove(selector);
           target.setGraveyard();
    }
   
    public void fillDeck(Player target){
            /*KingA ka = new KingA();
            KingB kb = new KingB();
            KingC kc = new KingC();
            QueenA qa = new QueenA();
            QueenB qb = new QueenB();
            QueenC qc = new QueenC();
            JackA ja = new JackA();
            JackB jb = new JackB();
            JackC jc = new JackC();*/
            King k = new King();
            Queen q = new Queen();
            Jack j = new Jack();
            for(int i=26;i>-1;i--){
                //if(i>23){(target.getDeck()).add(ka);}
                //else if(i>20){(target.getDeck()).add(kb);}
                if(i>17){(target.getDeck()).add(k);}
                //else if(i>14){(target.getDeck()).add(qa);}
                //else if(i>11){(target.getDeck()).add(qb);}
                else if(i>8){(target.getDeck()).add(q);}
                //else if(i>5){(target.getDeck()).add(ja);}
                //else if(i>2){(target.getDeck()).add(jb);}
                else if(i>-1){(target.getDeck()).add(j);}
            }
    }
}
