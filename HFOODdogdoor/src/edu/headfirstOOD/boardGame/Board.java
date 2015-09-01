package edu.headfirstOOD.boardGame;

import java.util.ArrayList;
import java.util.List;

public abstract class Board {
	private List<List<Tile>> tiles;
	private int height;
	private int width;
	
	public Board(int height, int width){
		this.height = height;
		this.width = width;
		initialize();		
	}
	
	private void initialize(){
		tiles = new ArrayList<List<Tile>>(width);
		for (int i=0; i<width; i++){
			List<Tile> tileColumn = new ArrayList<Tile>(height);
			for (int j=0; j<height; j++){
				tileColumn.add(new Tile());
			}
			tiles.add(tileColumn);
		}
	}
	
	public Tile getTile(int x, int y) throws OutOfBoardBoundaryException {
		verifyBoundary(x, y);
		return tiles.get(x-1).get(y-1);
	}
	
	public void addUnit(int x, int y, Unit unit) throws OutOfBoardBoundaryException {
		verifyBoundary(x, y);
		tiles.get(x-1).get(y-1).addUnit(unit);
	}
	
	public void removeUnit(int x, int y, Unit unit) throws OutOfBoardBoundaryException {
		verifyBoundary(x, y);
		tiles.get(x-1).get(y-1).removeUnit(unit);
	}
	
	public void removeUnits(int x, int y) throws OutOfBoardBoundaryException{
		verifyBoundary(x, y);
		tiles.get(x-1).get(y-1).removeUnits();
	}
	public List<Unit> getUnits(int x, int y) throws OutOfBoardBoundaryException {
		verifyBoundary(x, y);
		return tiles.get(x-1).get(y-1).getUnits();
	}
	
	public void moveUnit(int x1, int y1, int x2, int y2, Unit unit) throws OutOfBoardBoundaryException, noUnitsInTileException{
		if (!getUnits(x1, y1).contains(unit)) throw new noUnitsInTileException("No units at this tile");
		removeUnit(x1, y1, unit);
		addUnit(x2, y2, unit);
	}
	
	public void battle(int x, int y){
		// TODO Auto-generated method stub
	}
	
	public Terrain getTerrain(int x, int y) throws OutOfBoardBoundaryException{
		return getTile(x,y).getTerrain();
	}
	
	private void verifyBoundary(int x, int y) throws OutOfBoardBoundaryException {
		if (x<1 || x>height || y<1 || y> width) throw new OutOfBoardBoundaryException("Out of Board Range!");
	}
	
	

}
