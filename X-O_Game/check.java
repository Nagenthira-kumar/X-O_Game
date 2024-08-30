package ticTacToe;

public class check {
	
	public int win(char [] box) {
		int line=0;
		for(int i=0;i<8;i++) {
			
			
			switch(i) {
			case 0:
				line=box[0]+box[1]+box[2];
				break;
			case 1:
				line=box[3]+box[4]+box[5];
				break;
			case 2:
				line=box[6]+box[7]+box[8];
				break;
			case 3:
				line=box[0]+box[3]+box[6];
				break;
			case 4:
				line=box[1]+box[4]+box[7];
				break;
			case 5:
				line=box[2]+box[5]+box[8];
				break;
			case 6:
				line=box[0]+box[4]+box[8];
				break;
			case 7:
				line=box[2]+box[4]+box[6];
				break;
			
			
			}
			if(line==333) {
				System.out.println("Congratulations 'o' wins");
				return 1;
			}
			else if(line==360) {
				System.out.println("Congratulations 'x' wins");
				return 1;
			
			}
	
			
		}
		if(line !=333&&line!=360)
			System.out.println("Match draw");
		
		
		return 0;
		
		
		
		
	}

}
