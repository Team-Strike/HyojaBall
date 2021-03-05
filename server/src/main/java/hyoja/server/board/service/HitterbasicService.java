package hyoja.server.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hyoja.server.board.domain.HitterbasicVO;
import hyoja.server.board.mapper.HitterbasicMapper;

@Service("hyoja.server.board.service.HitterbasicService")
public class HitterbasicService {

  @Resource(name = "hyoja.server.board.mapper.HitterbasicMapper")
  HitterbasicMapper mHitterbasicMapper;

  public List<HitterbasicVO> hitterbasicListService() throws Exception {

    return mHitterbasicMapper.hitterbasicList();
  }

  public HitterbasicVO hitterbasicDetailService(int hbno) throws Exception {

    return mHitterbasicMapper.hitterbasicDetail(hbno);
  }

  public List<HitterbasicVO> hitterbasicList_team_seasonService(String team, String season) throws Exception {

    return mHitterbasicMapper.hitterbasicList_team_season(team, season);
  }

  // hitterbasic_team_season_hbidService
  public HitterbasicVO hitterbasic_team_season_hbidService(String team, String season, int hbid) throws Exception {

    return mHitterbasicMapper.hitterbasic_team_season_hbid(team, season, hbid);
  }
}