import React from "react";
import "./playerpage.css";

const Playerpage = () => {
  return (
    <div className="playerpage">
      <br />

      <div className="player_info1">
        <div className="player_name">
          <a>이름: </a>
        </div>
        <div className="player_birth">
          <a>생년월일: </a>
        </div>
        <div className="player_pay">
          <a>연봉: </a>
        </div>
      </div>
      <br />
      <br />
      <br />
      <div className="player_info2">
        <div className="player_graph">test</div>
        <div className="player_eva">
          <br />
          <a>연봉 / WAR: </a>
          <br />
          <br />
          <a>효율성:</a>
        </div>
      </div>
      <br />
      <br />
      <div className="player_option">
        <a>메인 </a>
        <a> 기본 기록</a>
      </div>
      <div className="player_detail">
        <div className="player_main">그래프</div>
      </div>
    </div>
  );
};

export default Playerpage;
