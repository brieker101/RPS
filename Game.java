public class Game
{
    public Game(){}
    
    public void newGame(){
        Player player1 = new Player("Human");
        Player player2 = new Player("Computer");
        player1.fillDeck(player1);
        player2.fillDeck(player2);
        player1.drawCard(player1);
        player2.drawCard(player2);
        player1.drawCard(player1);
        player2.drawCard(player2);
        player1.drawCard(player1);
        player2.drawCard(player2);
        
        for(int i=0;i<player1.getDeckSize();i++){
            System.out.println(player1.getDeckCard(i));
            
        }
        System.out.println(player1 + " choose your card.");
        for(int i = 0;i<player1.getHandSize();i++){
            System.out.println(i+1 + ": " + player1.getHandCard(i));
        }   
        for(int i = 0;i<player2.getHandSize();i++){
            System.out.println(i+1 + ": " + player2.getHandCard(i));
        } 
        
      
    
    }
    
}
