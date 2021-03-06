package hyoja.server.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hyoja.server.board.domain.PitchermainVO;

@Repository("hyoja.server.board.mapper.PitchermainMapper")
public interface PitchermainMapper {

  // 투수 메인 기록 리스트
  public List<PitchermainVO> pitchermainList() throws Exception;

  // 투수 메인 기록 상세
  public PitchermainVO pitchermainDetail(int pmno) throws Exception;

  // pitchermainList_team_season
  public List<PitchermainVO> pitchermainList_team_season(String team, String season) throws Exception;

  // pitchermain_team_season_pmid
  public PitchermainVO pitchermain_team_season_pmid(String team, String season, int pmid) throws Exception;
}
