package hyoja.server.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hyoja.server.board.domain.TeamVO;
import hyoja.server.board.mapper.TeamMapper;

@Service("hyoja.server.board.service.TeamService")
public class TeamService {

    @Resource(name = "hyoja.server.board.mapper.TeamMapper")
    TeamMapper mTeamMapper;

    public List<TeamVO> teamListService() throws Exception {

        return mTeamMapper.teamList();
    }

    public TeamVO teamDetailService(int tno) throws Exception {

        return mTeamMapper.teamDetail(tno);
    }
}
