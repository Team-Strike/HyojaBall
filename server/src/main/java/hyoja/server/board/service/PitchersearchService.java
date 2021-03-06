package hyoja.server.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hyoja.server.board.domain.PitchermainVO;
import hyoja.server.board.mapper.PitchersearchMapper;

@Service("hyoja.server.board.service.PitchersearchService")
public class PitchersearchService {

  @Resource(name = "hyoja.server.board.mapper.PitchersearchMapper")
  PitchersearchMapper mPitchersearchMapper;

  public List<PitchermainVO> pitchersearchListService(String name) throws Exception {

    return mPitchersearchMapper.pitchersearchList(name);
  }

}
