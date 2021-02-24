package hyoja.server.board.domain;

public class SeasonVO {
  private int id;
  private int team_id;
  private String name;
  private TeamVO team_recode;

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

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TeamVO getTeam_recode() {
    return this.team_recode;
  }

  public void setTeam_recode(TeamVO team_recode) {
    this.team_recode = team_recode;
  }

}
