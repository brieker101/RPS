public class Card implements Playable
{
    private int damage;
    private int heal;
    
    public void getEffect(Player target){}
    public void playCard(Card card1, Card card2, Player p1, Player p2){
     if((card1 instanceof Queen&&card2 instanceof Queen)||
            (card1 instanceof Jack&&card2 instanceof Jack)||
            (card1 instanceof King&&card2 instanceof King)){
            System.out.println("Tie!");
            }
        else if(card1 instanceof Jack&&card2 instanceof Queen){
            System.out.println("Player 1 wins the duel!");
            
        }
        else if (card1 instanceof Jack&&card2 instanceof King){
            System.out.println("Player 2 wins the duel!");
            
        }
        else if (card1 instanceof Queen&&card2 instanceof Jack){
            System.out.println("Player 2 wins the duel!");
            
           }
        
        else if (card1 instanceof Queen&&card2 instanceof King){
            System.out.println("Player 1 wins the duel!");
          
        }
        else if (card1 instanceof King&&card2 instanceof Jack){
            System.out.println("Player 1 wins the duel!");
            card1.getEffect(p2);
        }
        else if (card1 instanceof King&&card2 instanceof Queen){
            System.out.println("Player 2 wins the duel!");
            card2.getEffect(p1);
        }
        else{
            System.out.println("How did you break this?");
        }    
    }
}
