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
}