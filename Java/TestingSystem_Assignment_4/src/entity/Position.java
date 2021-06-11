package entity;

public class Position {
	private int id;
	private PositionName name;
	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name.toString() + "]";
	}
	public Position(int id, PositionName name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PositionName getName() {
		return name;
	}
	public void setName(PositionName name) {
		this.name = name;
	}
	
	
	
}
