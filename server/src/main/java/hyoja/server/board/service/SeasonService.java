package hyoja.server.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hyoja.server.board.domain.SeasonVO;
import hyoja.server.board.mapper.SeasonMapper;

@Service("hyoja.server.board.service.SeasonService")
public class SeasonService {

  @Resource(name = "hyoja.server.board.mapper.SeasonMapper")
  SeasonMapper mSeasonMapper;

  public List<SeasonVO> seasonListService() throws Exception {

    return mSeasonMapper.seasonList();
  }

  public SeasonVO seasonDetailService(int sno) throws Exception {

    return mSeasonMapper.seasonDetail(sno);
  }
}
