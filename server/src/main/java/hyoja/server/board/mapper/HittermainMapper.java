package hyoja.server.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hyoja.server.board.domain.HittermainVO;

@Repository("hyoja.server.board.mapper.HittermainMapper")
public interface HittermainMapper {

  // 타자 메인 기록 리스트
  public List<HittermainVO> hittermainList() throws Exception;

  // 타자 메인 기록 상세
  public HittermainVO hittermainDetail(int hmno) throws Exception;

  // hittermainList_team_season 해당 팀의 해당 시즌 타자 메인 기록 리스트
  public List<HittermainVO> hittermainList_team_season(String team, String season) throws Exception;

  // hittermain_team_season_hm
  public HittermainVO hittermain_team_season_hm(String team, String season, int hmid) throws Exception;
}
