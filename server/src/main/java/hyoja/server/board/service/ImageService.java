package hyoja.server.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hyoja.server.board.domain.ImageVO;
import hyoja.server.board.mapper.ImageMapper;

@Service("hyoja.server.board.service.ImageService")
public class ImageService {

  @Resource(name = "hyoja.server.board.mapper.ImageMapper")
  ImageMapper mImageMapper;

  public List<ImageVO> imageListService() throws Exception {

    return mImageMapper.imageList();
  }

  public ImageVO imageDetailService(int ino) throws Exception {

    return mImageMapper.imageDetail(ino);
  }
}
