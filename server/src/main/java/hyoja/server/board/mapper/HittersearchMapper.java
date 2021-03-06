package hyoja.server.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hyoja.server.board.domain.HittermainVO;

@Repository("hyoja.server.board.mapper.HittersearchMapper")
public interface HittersearchMapper {

  // name 선수 타자의 메인 기록 리스트 이름의
  public List<HittermainVO> hittersearchList(String name) throws Exception;

}
