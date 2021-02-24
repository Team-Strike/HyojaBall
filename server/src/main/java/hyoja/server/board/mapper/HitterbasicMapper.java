package hyoja.server.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hyoja.server.board.domain.HitterbasicVO;

@Repository("hyoja.server.board.mapper.HitterbasicMapper")
public interface HitterbasicMapper {

  public List<HitterbasicVO> hitterbasicList() throws Exception;

  // 타자 기본 기록 상세
  public HitterbasicVO hitterbasicDetail(int hbno) throws Exception;
}
