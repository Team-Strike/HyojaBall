package hyoja.server.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hyoja.server.board.domain.PitcherVO;

@Repository("hyoja.server.board.mapper.PitcherMapper")
public interface PitcherMapper {

  // 투수 목록
  public List<PitcherVO> pitcherList() throws Exception;

  // 투수 상세
  public PitcherVO pitcherDetail(int pno) throws Exception;

}