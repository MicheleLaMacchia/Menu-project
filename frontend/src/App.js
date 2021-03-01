import "./App.css";
import Footer from "./components/Footer/Footer";
import Header from "./components/Header/Header";
import Container from "react-bootstrap/Container";
import Navbar from "./components/Navbar/Navbar";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";

function App() {
  return (
    <div className="App">
      <Container>
        <Header />
        <Navbar />
        <Router>
          <Switch>
            <Route />
          </Switch>
        </Router>
        <Footer />
      </Container>
    </div>
  );
}

export default App;
