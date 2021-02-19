package hyoja.server.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hyoja.server.board.domain.TeamVO;
 
@Repository("hyoja.server.board.mapper.TeamMapper")
public interface TeamMapper {

  //팀 개수  
  public int teamCount() throws Exception;
    
  //팀 목록
  public List<TeamVO> teamList() throws Exception;
  
  //팀 상세
  public TeamVO teamDetail(int tno) throws Exception;
    
}