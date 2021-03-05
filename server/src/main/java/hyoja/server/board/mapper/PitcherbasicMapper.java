package hyoja.server.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hyoja.server.board.domain.PitcherbasicVO;

@Repository("hyoja.server.board.mapper.PitcherbasicMapper")
public interface PitcherbasicMapper {

  public List<PitcherbasicVO> pitcherbasicList() throws Exception;

  public PitcherbasicVO pitcherbasicDetail(int pbno) throws Exception;

  public List<PitcherbasicVO> pitcherbasicList_team_season(String team, String season) throws Exception;

  // pitcherbasic_team_season_pbid
  public PitcherbasicVO pitcherbasic_team_season_pbid(String team, String season, int pbid) throws Exception;
}
