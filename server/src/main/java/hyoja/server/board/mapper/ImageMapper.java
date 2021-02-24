package hyoja.server.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import hyoja.server.board.domain.ImageVO;

@Repository("hyoja.server.board.mapper.ImageMapper")
public interface ImageMapper {

  // 이미지 리스트
  public List<ImageVO> imageList() throws Exception;

  // 이미지 상세
  public ImageVO imageDetail(int ino) throws Exception;
}
