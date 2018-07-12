
public class player implements Comparable<player> {
	char name;
	int points;
		
	public player(char name, int points){
	this.name = name;
	this.points = points;
	}
	
	public int compareTo(player o) {
	    return (int)(this.points - o.points);
	  }
}
