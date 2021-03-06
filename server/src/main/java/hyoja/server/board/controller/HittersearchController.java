package hyoja.server.board.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hyoja.server.board.domain.HittermainVO;
import hyoja.server.board.service.HittersearchService;

@Controller
public class HittersearchController {

  @Resource(name = "hyoja.server.board.service.HittersearchService")
  HittersearchService mHittersearchService;

  @RequestMapping(value = "/hittersearch/{name}", method = RequestMethod.GET)
  @ResponseBody
  private List<HittermainVO> hittersearchList(@PathVariable String name, Model model) throws Exception {

    List<HittermainVO> hittersearchList = mHittersearchService.hittersearchListService(name);

    return hittersearchList;
  }

}
