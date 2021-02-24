package hyoja.server.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hyoja.server.board.domain.HitterVO;
import hyoja.server.board.mapper.HitterMapper;

@Service("hyoja.server.board.service.HitterService")
public class HitterService {

  @Resource(name = "hyoja.server.board.mapper.HitterMapper")
  HitterMapper mHitterMapper;

  public List<HitterVO> hitterListService() throws Exception {

    return mHitterMapper.hitterList();
  }

  public HitterVO hitterDetailService(int hno) throws Exception {

    return mHitterMapper.hitterDetail(hno);
  }
}
