import java.util.ArrayList;

public class Array2dDemo {
	
	private char[][] board;
	
	public Array2dDemo() {
		board = new char[3][3];
		for(int i = 0; i < 3; ++i) {
			for(int j = 0; j < 3; ++j) {
				board[i][j] = ' ';
			}
		}
	}
	
	public void set(int row, int col, char val) {
		board[row][col] = val;
	}
	
	public void print() {
		
		for(int i= 0; i < 3; ++i) {
			char[] row = board[i];
			for(int j = 0; j < 3; ++j) {
				System.out.print("|"+row[j]);
			}
			System.out.println("|");
		}
		
	}
	
	public boolean win( char player) {
		
		// check rows
		for(int row = 0; row < board.length; ++row) {
			int count = 0;
			for(int col = 0; col < 3; ++col) {
				if(board[row][col] == player) {
					count++;
				}
			}
			if(count ==3) {
				return true;
			}
		}
		
		// columns
		for(int col = 0; col < 3; ++col) {
			int count = 0;
			for(int row = 0; row < 3; ++row) {
				if(board[row][col] == player) {
					count++;
				}
			}
			if(count ==3) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Array2dDemo ttt = new Array2dDemo();
		
		ttt.set(1,2, 'X');
		ttt.set(2,1, 'O');
		ttt.print();
		
		ArrayList< ArrayList<Character> > board = new ArrayList<>();
		for(int i = 0; i < 3; ++i) {
			board.add(new ArrayList<>());
			for(int j = 0; j < 3; ++j) {
				board.get(i).add(' ');
			}
		}
		System.out.println( board.get(2).get(1));
		
		
		char[][] raggedArray = new char[3][];
		
		raggedArray[0] = new char[10];
		raggedArray[1] = new char[3];
		raggedArray[2] = new char[1];
		
		for(int i = 0; i < raggedArray.length; ++i) {
			for(int j = 0; j < raggedArray[i].length; ++j) {
				System.out.println(i + " " +j);
				System.out.println(raggedArray[i][j]);
			}
		}
		
		
		
		
		
	}

}
