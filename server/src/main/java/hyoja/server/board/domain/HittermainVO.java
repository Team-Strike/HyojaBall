package hyoja.server.board.domain;

public class HittermainVO {

	int id;
	String name;
	String team;
	int game;
	int appearance;
	int at_bat;
	int hit;
	int hr;
	int scored;
	int rbi;
	int bb;
	int strikesouts;
	int stolen_base;
	double batting_avg;
	double obp;
	double slg;
	double ops;
	double war;
	HitterbasicVO hitter_basic_recode;

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

	public int getGame() {
		return this.game;
	}

	public void setGame(int game) {
		this.game = game;
	}

	public int getAppearance() {
		return this.appearance;
	}

	public void setAppearance(int appearance) {
		this.appearance = appearance;
	}

	public int getAt_bat() {
		return this.at_bat;
	}

	public void setAt_bat(int at_bat) {
		this.at_bat = at_bat;
	}

	public int getHit() {
		return this.hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getHr() {
		return this.hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public int getScored() {
		return this.scored;
	}

	public void setScored(int scored) {
		this.scored = scored;
	}

	public int getRbi() {
		return this.rbi;
	}

	public void setRbi(int rbi) {
		this.rbi = rbi;
	}

	public int getBb() {
		return this.bb;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public int getStrikesouts() {
		return this.strikesouts;
	}

	public void setStrikesouts(int strikesouts) {
		this.strikesouts = strikesouts;
	}

	public int getStolen_base() {
		return this.stolen_base;
	}

	public void setStolen_base(int stolen_base) {
		this.stolen_base = stolen_base;
	}

	public double getBatting_avg() {
		return this.batting_avg;
	}

	public void setBatting_avg(double batting_avg) {
		this.batting_avg = batting_avg;
	}

	public double getObp() {
		return this.obp;
	}

	public void setObp(double obp) {
		this.obp = obp;
	}

	public double getSlg() {
		return this.slg;
	}

	public void setSlg(double slg) {
		this.slg = slg;
	}

	public double getOps() {
		return this.ops;
	}

	public void setOps(double ops) {
		this.ops = ops;
	}

	public double getWar() {
		return this.war;
	}

	public void setWar(double war) {
		this.war = war;
	}

	public HitterbasicVO getHitter_basic_recode() {
		return this.hitter_basic_recode;
	}

	public void setHitter_basic_recode(HitterbasicVO hitter_basic_recode) {
		this.hitter_basic_recode = hitter_basic_recode;
	}

}
