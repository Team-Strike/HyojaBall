import React from "react";
import { BrowserRouter, Route } from "react-router-dom";
import { Mainpage, Teampage, Playerpage } from "./page/index";
import { Header, Footer } from "./page/components/index";
import "./App.css";

const App = () => {
  return (
    <div className="App">
      <BrowserRouter>
        <Header />
        <Route path="/" exact component={Mainpage} />
        <Route path="/teampage" component={Teampage} />
        <Route path="/playerpage" component={Playerpage} />
        <Footer />
      </BrowserRouter>
    </div>
  );
};

export default App;
