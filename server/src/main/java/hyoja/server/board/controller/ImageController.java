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

import hyoja.server.board.domain.ImageVO;
import hyoja.server.board.service.ImageService;

@Controller
public class ImageController {

  @Resource(name = "hyoja.server.board.service.ImageService")
  ImageService mImageService;

  @RequestMapping(value = "/imagetest", method = RequestMethod.GET)
  @ResponseBody
  private List<ImageVO> imageList(Model model) throws Exception {

    List<ImageVO> imageList = mImageService.imageListService();

    return imageList;
  }

  @RequestMapping("/imagetest/{ino}")
  private String imageDetail(@PathVariable int ino, Model model) throws Exception {

    model.addAttribute("teamdetail", mImageService.imageDetailService(ino));

    return "teamdetail";
  }

}
