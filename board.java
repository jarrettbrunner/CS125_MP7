import java.util.Arrays;
/**
 * 
 * @author matthewwu
 * This class creates the board.
 */
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
	/**
	 * 
	 * @return the array to be used as a parameter for gameplay.
	 */
	public static char[][] getArray() {
		return array;
	}
	
	/**
	 * This method creates ships.
	 * @param length is the length of the ship
	 */
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
	/**
	 * This just shows what an example board looks like. We don't actually use this.
	 * @param agrs
	 */
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
