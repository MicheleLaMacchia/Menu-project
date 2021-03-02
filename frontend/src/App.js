import "./App.css";
import Footer from "./components/Footer/Footer";
import Header from "./components/Header/Header";
import Container from "react-bootstrap/Container";
import NavbarComponent from "./components/Navbar/NavbarComponent";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import HomeComponent from "./components/Home/HomeComponent";

function App() {
  return (
    <div className="App">
      <Header />
      <Container>
        <NavbarComponent />
        <Router>
          <Switch>
            <Route exact path="/" component={HomeComponent} />
            <Route path="/home" component={HomeComponent} />
          </Switch>
        </Router>
      </Container>
      <Footer />
    </div>
  );
}

export default App;
