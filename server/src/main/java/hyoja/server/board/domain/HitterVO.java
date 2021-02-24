package hyoja.server.board.domain;

import java.util.Date;

import hyoja.server.board.domain.TeamVO;
import hyoja.server.board.domain.SeasonVO;

public class HitterVO {
  private int id;
  private int team_id;
  private int season_id;
  private String name;
  private Date birthday;
  private int salary;
  private TeamVO team_recode;
  private SeasonVO season_recode;

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

  public TeamVO getTeam_recode() {
    return this.team_recode;
  }

  public void setTeam_recode(TeamVO team_recode) {
    this.team_recode = team_recode;
  }

  public SeasonVO getSeason_recode() {
    return this.season_recode;
  }

  public void setSeason_recode(SeasonVO season_recode) {
    this.season_recode = season_recode;
  }

}
