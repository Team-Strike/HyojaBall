import React from "react";
import "./mainpage.css";
const Mainpage = () => {
  return (
    <div className="mainpage">
      <br />
      <br />
      <br />
      <div className="search_form">
        <form>
          <a>선수 검색 &nbsp;&nbsp;</a>
          <input className="search_box" type="text" placeholder="Search ..." />
          &nbsp;
        </form>
      </div>
      <br />
      <br />
      <br />
      <br />
      <div className="top_rate">
        <div className="top_war">
          <h2>Top 10 War</h2>
        </div>
        <div className="top_pay">
          <h2>Top 10 연봉</h2>
        </div>
        <div className="top_hit">
          <h2>Top 10 타율</h2>
        </div>
        <div className="top_win">
          <h2>Top 10 승률</h2>
        </div>
      </div>
    </div>
  );
};

export default Mainpage;
