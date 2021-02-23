package hyoja.server.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hyoja.server.board.domain.HitterVO;

@Repository("hyoja.server.board.mapper.HitterMapper")
public interface HitterMapper {

  // 타자 목록
  public List<HitterVO> hitterList() throws Exception;

  // 타자 상세
  public HitterVO hitterDetail(int hno) throws Exception;

}
