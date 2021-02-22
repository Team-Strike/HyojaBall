package hyoja.server.board.domain;

public class PitchermainVO {

	int id;
	String name;
	String team;
	int win;
	int lose;
	int save;
	int hold;
	int blown;
	int game;
	int starting_pit;
	int inning;
	int strikesouts;
	int bb;
	int hr;
	double lob;
	double era;
	double ra9_war;
	double fip;
	double kfip;
	double war;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getWin() {
		return this.win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return this.lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getSave() {
		return this.save;
	}

	public void setSave(int save) {
		this.save = save;
	}

	public int getHold() {
		return this.hold;
	}

	public void setHold(int hold) {
		this.hold = hold;
	}

	public int getBlown() {
		return this.blown;
	}

	public void setBlown(int blown) {
		this.blown = blown;
	}

	public int getGame() {
		return this.game;
	}

	public void setGame(int game) {
		this.game = game;
	}

	public int getStarting_pit() {
		return this.starting_pit;
	}

	public void setStarting_pit(int starting_pit) {
		this.starting_pit = starting_pit;
	}

	public int getInning() {
		return this.inning;
	}

	public void setInning(int inning) {
		this.inning = inning;
	}

	public int getStrikesouts() {
		return this.strikesouts;
	}

	public void setStrikesouts(int strikesouts) {
		this.strikesouts = strikesouts;
	}

	public int getBb() {
		return this.bb;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public int getHr() {
		return this.hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public double getLob() {
		return this.lob;
	}

	public void setLob(double lob) {
		this.lob = lob;
	}

	public double getEra() {
		return this.era;
	}

	public void setEra(double era) {
		this.era = era;
	}

	public double getRa9_war() {
		return this.ra9_war;
	}

	public void setRa9_war(double ra9_war) {
		this.ra9_war = ra9_war;
	}

	public double getFip() {
		return this.fip;
	}

	public void setFip(double fip) {
		this.fip = fip;
	}

	public double getKfip() {
		return this.kfip;
	}

	public void setKfip(double kfip) {
		this.kfip = kfip;
	}

	public double getWar() {
		return this.war;
	}

	public void setWar(double war) {
		this.war = war;
	}

}
