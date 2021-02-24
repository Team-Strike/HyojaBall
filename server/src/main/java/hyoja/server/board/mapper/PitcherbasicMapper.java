package hyoja.server.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hyoja.server.board.domain.PitcherbasicVO;

@Repository("hyoja.server.board.mapper.PitcherbasicMapper")
public interface PitcherbasicMapper {

  public List<PitcherbasicVO> pitcherbasicList() throws Exception;

  public PitcherbasicVO pitcherbasicDetail(int pbno) throws Exception;
}
