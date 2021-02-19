package hyoja.server.board.mapper;

import org.springframework.stereotype.Repository;
 
@Repository("hyoja.server.board.mapper.InitTable")
public interface InitTable {
  //타자수  
  public void teamTable() throws Exception;
  public void hitterMainTable() throws Exception;
  public void pticherMainTable() throws Exception;
  public void playerTable() throws Exception;
  public void hitterBasicTable() throws Exception;
  public void pitcherBasicTable() throws Exception;

}
