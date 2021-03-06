package hyoja.server.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hyoja.server.board.domain.PitchermainVO;

@Repository("hyoja.server.board.mapper.PitchersearchMapper")
public interface PitchersearchMapper {

  // name 선수 타자의 메인 기록 리스트 이름의
  public List<PitchermainVO> pitchersearchList(String name) throws Exception;

}
