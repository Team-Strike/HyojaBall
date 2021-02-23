package hyoja.server.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hyoja.server.board.domain.SeasonVO;

@Repository("hyoja.server.board.mapper.TeamMapper")
public interface SeasonMapper {

  // 시즌
  public List<SeasonVO> seasonList() throws Exception;

  // 시즌 상세
  public SeasonVO seasonDetail(int sno) throws Exception;

}
