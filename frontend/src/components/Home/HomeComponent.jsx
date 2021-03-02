import { useEffect, useState } from "react";
import Container from "react-bootstrap/esm/Container";
import Row from "react-bootstrap/Row";
import { getAllCategories } from "../../API/APICategorie";
import CardComponent from "./CastegoryCard";
import "./HomeComponent.css";

const HomeComponent = () => {
  const [categorie, setCategorie] = useState([]);

  useEffect(() => {
    getAllCategories().then((res) => {
      console.log("chiamo il DB nell'homeComponent", res.data);
      setCategorie(res.data);
    });
  }, []);

  return (
    <Container>
      <Row>
        {categorie.map((cat) => (
          <CardComponent
            key={cat.id}
            titolo={cat.nome}
            immagine={cat.immagine}
          />
        ))}
      </Row>
    </Container>
  );
};

export default HomeComponent;
