import "./App.css";
import Footer from "./components/Footer/Footer";
import Header from "./components/Header/Header";
import Container from "react-bootstrap/Container";
import NavbarComponent from "./components/Navbar/NavbarComponent";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";

//import Card from "react-bootstrap/Card";

function App() {
  return (
    <div className="App">
      <Header />
      <Container>
        <NavbarComponent />
        <Router>
          <Switch>
            <Route />
          </Switch>
        </Router>
      </Container>
      <Footer />
    </div>
  );
}

export default App;
