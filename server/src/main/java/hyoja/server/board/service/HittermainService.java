package hyoja.server.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hyoja.server.board.domain.HittermainVO;
import hyoja.server.board.mapper.HittermainMapper;

@Service("hyoja.server.board.service.HittermainService")
public class HittermainService {

  @Resource(name = "hyoja.server.board.mapper.HittermainMapper")
  HittermainMapper mHittermainMapper;

  public List<HittermainVO> hittermainListService() throws Exception {

    return mHittermainMapper.hittermainList();
  }

  public HittermainVO hittermainDetailService(int hmno) throws Exception {

    return mHittermainMapper.hittermainDetail(hmno);
  }

  // hittermainList_team_year
  /*
   * public List<HittermainVO> hittermainList_team_year(String team, String year)
   * throws Exception {
   * 
   * return mHittermainMapper.hittermainList_team_year(team, year); }
   */
}