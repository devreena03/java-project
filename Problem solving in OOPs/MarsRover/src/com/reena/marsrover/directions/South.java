package com.reena.marsrover.directions;

import com.reena.marsrover.Position;

public class South implements Direction {
	@Override
	public Direction moveLeft() {
		return new East();	
	}

	@Override
	public Direction moveRight() {
		return new West();		
	}
	
	@Override
	public String toString() {
		return "S";
	}

	@Override
	public Position moveUp(Position position) {
		 position.setyCoordinate(position.getyCoordinate()-1);
		 return position;
	}
}
