package edu.headfirstOOD.boardGame;

public abstract class Board {
	private Tile[][] tiles;
	private int height;
	private int width;
	
	public Board(int height, int width){
		this.height = height;
		this.width = width;
		tiles = new Tile[height][width];
		for (int i=0; i<height; i++){
			for (int j=0; j<width; j++){
				tiles[i][j] = new Tile();
			}
		}
		
		
	}
	
	public Tile getTile(int x, int y) throws OutOfBoardBoundaryException {
		verifyBoundary(x, y);
		return tiles[x-1][y-1];
	}
	
	public void addUnits(int x, int y, Units units) throws OutOfBoardBoundaryException {
		verifyBoundary(x, y);
		tiles[x-1][y-1].addUnits(units);
	}
	
	public void removeUnits(int x, int y, Units units) throws OutOfBoardBoundaryException {
		verifyBoundary(x, y);
		tiles[x-1][y-1].removeUnits(units);
	}
	
	public Units getUnits(int x, int y) throws OutOfBoardBoundaryException {
		verifyBoundary(x, y);
		return tiles[x-1][y-1].getUnits();
	}
	
	private void verifyBoundary(int x, int y) throws OutOfBoardBoundaryException {
		if (x<1 || x>height || y<1 || y> width) throw new OutOfBoardBoundaryException("Out of Board Range!");
	}
	

}
