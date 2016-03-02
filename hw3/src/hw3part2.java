/* Author: Caleb Yoon <calebyoon1@gmail.com>
 * Date: Feb 26, 2016
 * 
 * This program plays the memory matching game by using 16 cards that
 * are laid out in a 4*4 square and are labeled with pairs of numbers
 * from 1 to 8. Also. program allows the player to specify the cards that
 * he or she would like to select through a coordinate system.
 */

import java.util.*;
import java.lang.*;
	
public class hw3part2
	{
	    public static void main(String[] args){
	        String pl="";
	        Scanner kb=new Scanner(System.in);
	        System.out.println("Enter the card coordinate for each card when requested");
	        System.out.println();
	        do
	        {
	            brd();
	            System.out.println("you are the winner");
	            System.out.println("Wanna play again? Yes/No(Y/N)");
	            pl=kb.next();
	        }while (pl.equals("y")||pl.equals("Y"));
	    System.out.println("It was fun? Thank You for playing");
	    }
	 
	 
	//print the board
	    
	    public static void brd(){
	        int cards[][]=new int[4][4];
	        boolean cs[][]=new boolean[4][4];
	 
	        cards=shuf();
	        System.out.println("   | 1 2 3 4 ");
	        System.out.println("---+---------");
	        for(int i=0;i<4;++i)
	        {
	            System.out.print(" " +(i+1) +" | ");
	            for(int j=0;j<4;++j)
	            {
	                System.out.print("* ");
	                cs[i][j]=false;
	            }
	            System.out.println();
	        }
	        System.out.println();
	        str(cs,cards);
	}
	 
	 
	//game starts here
	    
	    public static void str(boolean[][] cs,int[][] cards){
	        boolean ov=false;
	        Scanner kb=new Scanner(System.in);
	 
	        char rw0,rw1,cl0,cl1;
	        int r1,c1;
	        int r2=0,c2=0, tmr=5000;
	        
	        //Timer timer=new Timer(tmr);
	        
	        do {
	        
	            do {
	            
	                System.out.print("Please insert your 1st card:");
	                String rw=new String(kb.next());
	                rw0=rw.charAt(0);cl0=rw.charAt(1);
	                r1=Character.digit(rw0,5);c1=Character.digit(cl0,5);
	                if(cs[r1-1][c1-1] == true) {
	                
	                    System.out.println("This card is already flipped! Select another card.");
	                }
	            }
	            
	            while(cs[r1-1][c1-1]!= false);
	            do {
	            
	                System.out.print("Please insert your 2nd card:");
	                String rw11=new String(kb.next());
	                rw1=rw11.charAt(0);cl1=rw11.charAt(1);
	                r2=Character.digit(rw1,5);c2=Character.digit(cl1,5);
	                if(cs[r2-1][c2-1] == true) {
	                    System.out.print("This card is already flipped! Please choose another card.");
	                }
	                if((r1==r2)&&(c1==c2)){
	                    System.out.print("This card is already chosen! Please choose another card.");
	                }
	            }
	            
	            while((cs[r2-1][c2-1]!= false)||((r1==r2)&&(c1==c2)));
	            r1--;
	            c1--;
	            r2--;
	            c2--;
	            System.out.println();
	            System.out.println("   | 1 2 3 4 ");
	            System.out.println("---+---------");
	            for (int r=0; r<4; r++){
	            
	                System.out.print(" " +(r+1) +" | ");
	                for (int c=0; c<4; c++){
	                
	                    if ((r==r1)&&(c==c1)){
	                    
	                        System.out.print(cards[r][c] +" ");
	                    }
	                    else if((r==r2)&&(c==c2)){
	                    
	                        System.out.print(cards[r][c] +" ");
	                    }
	                    else if (cs[r][c] == true){
	                    
	                        System.out.print(cards[r][c] +" ");
	                    }
	                    else {
	                    	System.out.print("* ");
	                    }
	                }
	                System.out.println();
	            }
	            System.out.println();
	     
	            // to keep the card flipped
	     
	            if (cards[r1][c1]==cards[r2][c2]) {
	                System.out.println("Cards Matched!");
	 
	                cs[r1][c1] = true;
	                cs[r2][c2] = true;
	            }
	            //should have timer delay here
	            //System.out.println("Insert any key to continue.");
	            //String asd=kb.next();
	            
	            try {
	            
	                Thread.sleep(2000);
	 
	            }
	            catch (InterruptedException ie) {
	                System.out.println(ie.getMessage());
	            }
	            
	            for (int b=0; b<=20; b++){
	                System.out.println();
	            }
	            
	            System.out.println("   | 1 2 3 4 ");
	            System.out.println("---+---------");
	            
	            // reprint the board,for user to make new guess
	            for (int r=0; r<4; r++) {
	            
	                System.out.print(" " +(r+1) +" | ");
	                
	                for (int c=0; c<4; c++)
	                {
	                    if (cs[r][c] == true)
	                    {
	                        System.out.print(cards[r][c] +" ");
	                    }
	                    else
	                    {
	                        System.out.print("* ");
	                    }
	                }
	                System.out.println();
	            }
	            System.out.println();
	            ov = true;
	            
	         // check all card status, they all should be true/flipped to end the game.
	            for (int r=0; r<4; r++) {
	            
	                for (int c=0; c<4; c++){
	                
	                    if(cs[r][c]==false)
	                    {
	                      ov = false;
	                      c=5;
	                    }
	                }
	                if(ov == false){
	                
	                    r=5;
	                }
	            }
	            
	         // loop, the only way to get out is to finish the game!
	        } while(ov != true); 
	    }
	 
	 
	 
	    //shuffle the cards
	    public static int[][] shuf(){
	        int start[]={1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8};
	        int cards[][]=new int[4][4];
	        Random ran=new Random();
	        int tmp,i;
	        for (int s=0; s<=20; s++)
	        {
	        	//randomize the card placements
	            for (int x=0; x<16; x++) {
	            
	                i=ran.nextInt(100000)%15;
	                tmp=start[x];
	                start[x]=start[i];
	                start[i]=tmp;
	            }
	        }
	        i=0;
	 
	     // put values in cards here
	        
	        for (int r=0; r<4; r++) {
	        
	            for (int c=0; c<4; c++)
	            {
	                cards[r][c]=start[i];
	                i=i+1;
	            }
	        }
	        return cards;
	    }
}
