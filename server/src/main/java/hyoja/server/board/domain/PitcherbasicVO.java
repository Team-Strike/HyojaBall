package hyoja.server.board.domain;

public class PitcherbasicVO {
  private int id;
  private int pitcher_main_record_id;
  private int complete;
  private int shutout;
  private int qs;
  private int hitter;
  private int hit;
  private int doubles;
  private int triple;
  private int runs;
  private int eruns;
  private int strikesouts;
  private int ibb;
  private int hbp;
  private int wild_pitch;
  private int balk;
  private int pk;
  private int stolen_base;
  private int caught_stealing;
  private PitchermainVO pitchermain_recode;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getPitcher_main_record_id() {
    return this.pitcher_main_record_id;
  }

  public void setPitcher_main_record_id(int pitcher_main_record_id) {
    this.pitcher_main_record_id = pitcher_main_record_id;
  }

  public int getComplete() {
    return this.complete;
  }

  public void setComplete(int complete) {
    this.complete = complete;
  }

  public int getShutout() {
    return this.shutout;
  }

  public void setShutout(int shutout) {
    this.shutout = shutout;
  }

  public int getQs() {
    return this.qs;
  }

  public void setQs(int qs) {
    this.qs = qs;
  }

  public int getHitter() {
    return this.hitter;
  }

  public void setHitter(int hitter) {
    this.hitter = hitter;
  }

  public int getHit() {
    return this.hit;
  }

  public void setHit(int hit) {
    this.hit = hit;
  }

  public int getDoubles() {
    return this.doubles;
  }

  public void setDoubles(int doubles) {
    this.doubles = doubles;
  }

  public int getTriple() {
    return this.triple;
  }

  public void setTriple(int triple) {
    this.triple = triple;
  }

  public int getRuns() {
    return this.runs;
  }

  public void setRuns(int runs) {
    this.runs = runs;
  }

  public int getEruns() {
    return this.eruns;
  }

  public void setEruns(int eruns) {
    this.eruns = eruns;
  }

  public int getStrikesouts() {
    return this.strikesouts;
  }

  public void setStrikesouts(int strikesouts) {
    this.strikesouts = strikesouts;
  }

  public int getIbb() {
    return this.ibb;
  }

  public void setIbb(int ibb) {
    this.ibb = ibb;
  }

  public int getHbp() {
    return this.hbp;
  }

  public void setHbp(int hbp) {
    this.hbp = hbp;
  }

  public int getWild_pitch() {
    return this.wild_pitch;
  }

  public void setWild_pitch(int wild_pitch) {
    this.wild_pitch = wild_pitch;
  }

  public int getBalk() {
    return this.balk;
  }

  public void setBalk(int balk) {
    this.balk = balk;
  }

  public int getPk() {
    return this.pk;
  }

  public void setPk(int pk) {
    this.pk = pk;
  }

  public int getStolen_base() {
    return this.stolen_base;
  }

  public void setStolen_base(int stolen_base) {
    this.stolen_base = stolen_base;
  }

  public int getCaught_stealing() {
    return this.caught_stealing;
  }

  public void setCaught_stealing(int caught_stealing) {
    this.caught_stealing = caught_stealing;
  }

  public PitchermainVO getPitchermain_recode() {
    return this.pitchermain_recode;
  }

  public void setPitchermain_recode(PitchermainVO pitchermain_recode) {
    this.pitchermain_recode = pitchermain_recode;
  }

}
