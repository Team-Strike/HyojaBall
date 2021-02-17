package hyoja.server.board.mapper;

import org.springframework.stereotype.Repository;
 
@Repository("hyoja.server.board.mapper.HiterMapper")
public interface HiterMapper {
 
    //타자수  
    public int hiterCount() throws Exception;
    
}
