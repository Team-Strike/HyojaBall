package hyoja.server.board.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import hyoja.server.board.domain.HittermainVO;
import hyoja.server.board.service.HittermainService;

@Controller
public class HittermainController {

  @Resource(name = "hyoja.server.board.service.HittermainService")
  HittermainService mHittermainService;

  @RequestMapping(value = "/hittermain", method = RequestMethod.GET)
  @ResponseBody
  private List<HittermainVO> hittermainList(Model model) throws Exception {

    List<HittermainVO> hittermainList = mHittermainService.hittermainListService();

    return hittermainList;
  }

  @RequestMapping(value = "/hittermain/{hmno}", method = RequestMethod.GET)
  @ResponseBody
  private HittermainVO hittermainDetail(@PathVariable int hmno, Model model) throws Exception {

    HittermainVO hittermainDetail = mHittermainService.hittermainDetailService(hmno);

    return hittermainDetail;
  }

}
