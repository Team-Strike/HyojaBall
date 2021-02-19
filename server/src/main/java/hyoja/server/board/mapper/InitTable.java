package hyoja.server.board.mapper;

import org.springframework.stereotype.Repository;
 
@Repository("hyoja.server.board.mapper.InitTable")
public interface InitTable {
  //타자수  
  public void initTable() throws Exception;
    
}
