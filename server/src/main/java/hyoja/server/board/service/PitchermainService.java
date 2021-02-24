package hyoja.server.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hyoja.server.board.domain.PitchermainVO;
import hyoja.server.board.mapper.PitchermainMapper;

@Service("hyoja.server.board.service.PitchermainService")
public class PitchermainService {

  @Resource(name = "hyoja.server.board.mapper.PitchermainMapper")
  PitchermainMapper mPitchermainMapper;

  public List<PitchermainVO> pitchermainListService() throws Exception {

    return mPitchermainMapper.pitchermainList();
  }

  public PitchermainVO pitchermainDetailService(int pmno) throws Exception {

    return mPitchermainMapper.pitchermainDetail(pmno);
  }
}