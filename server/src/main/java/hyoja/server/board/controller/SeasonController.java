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

import hyoja.server.board.domain.SeasonVO;
import hyoja.server.board.service.SeasonService;

@Controller
public class SeasonController {

  @Resource(name = "hyoja.server.board.service.SeasonService")
  SeasonService mSeasonService;

  @RequestMapping(value = "/season", method = RequestMethod.GET)
  @ResponseBody
  private List<SeasonVO> teamList(Model model) throws Exception {

    List<SeasonVO> seasonList = mSeasonService.seasonListService();

    return seasonList;
  }

  @RequestMapping(value = "/season/{sno}", method = RequestMethod.GET)
  @ResponseBody
  private SeasonVO teamDetail(@PathVariable int sno, Model model) throws Exception {

    SeasonVO seasonDetail = mSeasonService.seasonDetailService(sno);

    return seasonDetail;
  }

}
