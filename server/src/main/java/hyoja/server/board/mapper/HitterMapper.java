package hyoja.server.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hyoja.server.board.domain.HitterVO;
import hyoja.server.board.domain.HittermainVO;

@Repository("hyoja.server.board.mapper.TeamMapper")
public interface HitterMapper {

  // 타자 목록
  public List<HitterVO> hitterList() throws Exception;

  // 타자 상세
  public HitterVO hitterDetail(int tno) throws Exception;

  // 타자 메인 기록
  public HittermainVO hittermainRecode() throws Exception;
}
