package hyoja.server.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hyoja.server.board.domain.HittermainVO;
import hyoja.server.board.mapper.HittersearchMapper;

@Service("hyoja.server.board.service.HittersearchService")
public class HittersearchService {

  @Resource(name = "hyoja.server.board.mapper.HittersearchMapper")
  HittersearchMapper mHittersearchMapper;

  public List<HittermainVO> hittersearchListService(String name) throws Exception {

    return mHittersearchMapper.hittersearchList(name);
  }

}
