import Card from "react-bootstrap/Card";
import "./CategoryCard.css";

const CategoryCard = ({ titolo, immagine }) => {
  return (
    <Card bg="secondary" text="light" className="single-card mb-2">
      <Card.Header>{titolo}</Card.Header>
      <Card.Body>
        <img
          className="card-image"
          src={`data:image/png;base64,${immagine}`}
          alt={titolo}
        />
      </Card.Body>
    </Card>
  );
};

export default CategoryCard;
