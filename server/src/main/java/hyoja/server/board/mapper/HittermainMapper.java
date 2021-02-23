package hyoja.server.board.mapper;

import org.springframework.stereotype.Repository;

import hyoja.server.board.domain.HittermainVO;

@Repository("hyoja.server.board.mapper.HittermainMapper")
public interface HittermainMapper {

  // 타자 메인 기록 상세
  public HittermainVO teamDetail(int hmno) throws Exception;

}
