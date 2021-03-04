package hyoja.server.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hyoja.server.board.domain.PitcherbasicVO;
import hyoja.server.board.mapper.PitcherbasicMapper;

@Service("hyoja.server.board.service.PitcherbasicService")
public class PitcherbasicService {

  @Resource(name = "hyoja.server.board.mapper.PitcherbasicMapper")
  PitcherbasicMapper mPitcherbasicMapper;

  public List<PitcherbasicVO> pitcherbasicListService() throws Exception {

    return mPitcherbasicMapper.pitcherbasicList();
  }

  public PitcherbasicVO pitcherbasicDetailService(int pbno) throws Exception {

    return mPitcherbasicMapper.pitcherbasicDetail(pbno);
  }

  public List<PitcherbasicVO> pitcherbasicList_team_seasonService(String team, String season) throws Exception {

    return mPitcherbasicMapper.pitcherbasicList_team_season(team, season);
  }
}