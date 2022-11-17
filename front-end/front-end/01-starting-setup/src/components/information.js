import "./information.css";

function Information() {
    const id = 1891;
    const firstName = "Benzema";
    const secondName= "Karim";
    const phoneNumber = "0756 189 989"
    const email = "benzema.karim@solera.com"

  return (
    <div className="information">
        <label>{id}</label>
        <input type="text"/>
        <label className="information__description">{firstName}</label>
        <input type="text"/>
        <label className="information__description">{secondName}</label>
        <input type="text"/>
        <label className="information__price">{phoneNumber}</label>
        <input type="text"/>
        <label className="information__price">{email}</label>
        <input type="text"/>
      <h2>{firstName}</h2>
      <h2>{secondName}</h2>
      <h2>{phoneNumber}</h2>
      <h2>{email}</h2>
    </div>
  );
}

export default Information;
