package hyoja.server.board.domain;

public class HitterbasicVO {
  int id;
  int hitter_main_record_id;
  int single;
  int doubles;
  int triple;
  int ibb;
  int HBP;
  int sac_fly;
  int sac_bunt;
  int gidp;
  int caught_stealing;
  HittermainVO hittermain_recode;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getHitter_main_record_id() {
    return this.hitter_main_record_id;
  }

  public void setHitter_main_record_id(int hitter_main_record_id) {
    this.hitter_main_record_id = hitter_main_record_id;
  }

  public int getSingle() {
    return this.single;
  }

  public void setSingle(int single) {
    this.single = single;
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

  public int getIbb() {
    return this.ibb;
  }

  public void setIbb(int ibb) {
    this.ibb = ibb;
  }

  public int getHBP() {
    return this.HBP;
  }

  public void setHBP(int HBP) {
    this.HBP = HBP;
  }

  public int getSac_fly() {
    return this.sac_fly;
  }

  public void setSac_fly(int sac_fly) {
    this.sac_fly = sac_fly;
  }

  public int getSac_bunt() {
    return this.sac_bunt;
  }

  public void setSac_bunt(int sac_bunt) {
    this.sac_bunt = sac_bunt;
  }

  public int getGidp() {
    return this.gidp;
  }

  public void setGidp(int gidp) {
    this.gidp = gidp;
  }

  public int getCaught_stealing() {
    return this.caught_stealing;
  }

  public void setCaught_stealing(int caught_stealing) {
    this.caught_stealing = caught_stealing;
  }

  public HittermainVO getHittermain_recode() {
    return this.hittermain_recode;
  }

  public void setHittermain_recode(HittermainVO hittermain_recode) {
    this.hittermain_recode = hittermain_recode;
  }

}
