import java.util.Arrays;
public final class board {
	
	public static char[][] array = {{'s', 's', 's', 's', 's', 's', 's', 's', 's', 's',},
			{'s', 's', 's', 's', 's', 's', 's', 's', 's', 's',},
	{'s', 's', 's', 's', 's', 's', 's', 's', 's', 's',},
	{'s', 's', 's', 's', 's', 's', 's', 's', 's', 's',},
	{'s', 's', 's', 's', 's', 's', 's', 's', 's', 's',},
	{'s', 's', 's', 's', 's', 's', 's', 's', 's', 's',},
	{'s', 's', 's', 's', 's', 's', 's', 's', 's', 's',},
	{'s', 's', 's', 's', 's', 's', 's', 's', 's', 's',},
	{'s', 's', 's', 's', 's', 's', 's', 's', 's', 's',},
	{'s', 's', 's', 's', 's', 's', 's', 's', 's', 's',}};
	
	// Should place a ship horizontally on a 10x10 board
	public static void placeShip(int length) {
		
		if (length == 0) {
			return;
		}
		
		int x = (int) (Math.random() * (11 - length));
		int y = (int) (Math.random() * (11 - length));
		int orient = (int) (Math.random() * 2);
		
		// When horizontal
		if(orient == 0) {
			for (int i = 0; i < length; i++) {
				if (array[x][y + i] == 'c') {
					placeShip(length);
					return;
				}
			}
			for (int i = 0; i < length; i++) {
				array[x][y + i] = 'c';
			}
			
		// When vertical
		} else {
			for (int i = 0; i < length; i++) {
				if (array[x + i][y] == 'c') {
					placeShip(length);
					return;
				}
			}
			for (int i = 0; i < length; i++) {
				array[x + i][y] = 'c';
			}
		}
		
		return;
	}
	
	public static void main(String[] agrs) {
		placeShip(2);
		placeShip(3);
		placeShip(3);
		placeShip(4);
		placeShip(5);
		for (int i = 0; i < 10; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		return;
	}
}