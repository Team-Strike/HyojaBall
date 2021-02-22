package hyoja.server.board.domain;

import java.util.Date;

import hyoja.server.board.domain.HittermainVO;

public class HitterVO {
  int id;
  int team_id;
  int season_id;
  String name;
  Date birthday;
  int salary;
  HittermainVO hitter_main_recode;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getTeam_id() {
    return this.team_id;
  }

  public void setTeam_id(int team_id) {
    this.team_id = team_id;
  }

  public int getSeason_id() {
    return this.season_id;
  }

  public void setSeason_id(int season_id) {
    this.season_id = season_id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getBirthday() {
    return this.birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public int getSalary() {
    return this.salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public HittermainVO getHitter_main_recode() {
    return this.hitter_main_recode;
  }

  public void setHitter_main_recode(HittermainVO hitter_main_recode) {
    this.hitter_main_recode = hitter_main_recode;
  }

}
