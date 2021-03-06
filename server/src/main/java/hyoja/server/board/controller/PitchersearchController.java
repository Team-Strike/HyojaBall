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

import hyoja.server.board.domain.PitchermainVO;
import hyoja.server.board.service.PitchersearchService;

@Controller
public class PitchersearchController {

  @Resource(name = "hyoja.server.board.service.PitchersearchService")
  PitchersearchService mPitchersearchService;

  @RequestMapping(value = "/pitchersearch/{name}", method = RequestMethod.GET)
  @ResponseBody
  private List<PitchermainVO> pitchersearchList(@PathVariable String name, Model model) throws Exception {

    List<PitchermainVO> pitchersearchList = mPitchersearchService.pitchersearchListService(name);

    return pitchersearchList;
  }

}
