package hyoja.server.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hyoja.server.board.domain.PitcherVO;
import hyoja.server.board.mapper.PitcherMapper;

@Service("hyoja.server.board.service.PitcherService")
public class PitcherService {

  @Resource(name = "hyoja.server.board.mapper.PitcherMapper")
  PitcherMapper mPitcherMapper;

  public List<PitcherVO> pitcherListService() throws Exception {

    return mPitcherMapper.pitcherList();
  }

  public PitcherVO pitcherDetailService(int pno) throws Exception {

    return mPitcherMapper.pitcherDetail(pno);
  }
}
