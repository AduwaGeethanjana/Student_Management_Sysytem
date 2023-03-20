import axios from "axios";
import React, { useEffect,useState } from "react";
import { Link, useParams } from "react-router-dom";

export default function ViewUser() {
  const [user, setUser] = useState({
    name: "",
    usernames: "",
    email: "",
    degreeProgram:""
  });

  const { id } = useParams();

  useEffect(() => {
    loadUser();
  }, []);

  const loadUser = async () => {
    const result = await axios.get(`http://localhost:8080/user/${id}`);
    setUser(result.data);
  };

  return (
    <div className="container">
      <div className="row">
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
          <h2 className="text-center m-4">Student Details</h2>

          <div className="card">
            <div className="card-header">
              Details of User ID : {user.id}
              <ul className="list-group list-group-flush">
                <li className="list-group-item">
                  <b>Name :</b>
                  {user.name}
                </li>
                <li className="list-group-item">
                  <b>UserName :</b>
                  {user.usernames}
                </li>
                <li className="list-group-item">
                  <b>Email :</b>
                  {user.email}
                </li>
                <li className="list-group-item">
                  <b>Degree Program :</b>
                  {user.degreeProgram}
                </li>
              </ul>
            </div>
          </div>
          <Link className="btn btn-primary my-2" to={"/home"}>
            Back 
          </Link>
        </div>
      </div>
    </div>
  );
}