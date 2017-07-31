package oop4;

import java.util.List;

public abstract class Node 
{
	public abstract String getName();
	public abstract void setName(String name);
	public abstract String getPlace();
	public abstract void setPlace(String place);
	public abstract String getType();
	public abstract void setType(String type);
	public abstract void addNeighbour(Node conn);
	public abstract boolean removeNeighbour(Node remove);
	public abstract void displayNeighbour();
	public abstract boolean isFriend(Node query);
	public abstract List<Node> getNeighbours();
	public abstract boolean blockNode(Node node);
	public abstract boolean isBlockedNode(Node node);
}
