package ticTacToe;
import java.util.*;
public class ticTacToe {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		display d= new display();
		check w=new check();
		
		
		char [] box={'1','2','3','4','5','6','7','8','9'};
		System.out.println("Welcome to 3x3 Tic Tac Toe:");

		d.display1(box);
		char turn='o';
		char c;
		for(int i=1;i<=9;i++)
		{
			
			if(turn=='x') {
			System.out.println("o's turn enter where to put :");
			 c=s.next().charAt(0);
			turn='o';
			}
			else {
				System.out.println("x's turn enter where to put :");
			 c=s.next().charAt(0);
			turn='x';
			}
		    
		     if(i%2!=0) {
		     for(int j=0;j<box.length;j++) {
		    	 if(box[j]==c)
		    		 box[j]='x'; 
		     }
		     d.display1(box);
		    if(w.win(box)==1)
		    	break;
		     }
		     else {
		    	 for(int j=0;j<box.length;j++) {
			    	 if(box[j]==c)
			    		 box[j]='o'; 
			     }
			    	 d.display1(box);
			    	 if(w.win(box)==1)
				    	 break;
			    	
			     }
		     }
		}
		
	}



