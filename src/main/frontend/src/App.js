import React, {useCallback, useState, useEffect} from 'react';
import './App.css';
import axios from 'axios';
import {useDropzone} from 'react-dropzone'

const UserProfiles = () => {

    const [userProfiles, setUserProfiles] = useState([]);

    const fetchUserProfiles = () => {
        axios.get("http://localhost:1111/api/v1/user-profile").then(res => {
            console.log(res);
            setUserProfiles(res.data);
        });
    };

    useEffect(() => {
        fetchUserProfiles();
    }, []);

    return userProfiles.map((userProfile, index) => {

        return (
            <div key={index}>
                <br/>
                <br/>
                <h1>{userProfile.userName}</h1>
                <p>{userProfile.userProfileId}</p>
                {/*<Dropzone {...userProfile} same as line below/>*/}
                <Dropzone userProfileId={userProfile.userProfileId}/>
                <br/>
            </div>
        )
    })
};

function Dropzone({ userProfileId }) {
    const onDrop = useCallback(acceptedFiles => {
        const file = acceptedFiles[0];

        console.log(file);

        const formData = new FormData();
        formData.append("file", file);

        axios.post(
            `http://localhost:1111/api/v1/user-profile/${userProfileId}/image/upload`),
            formData,
            {
                headers: {
                    "Content-Type": "multipart/form-data"
                }//everything we need to send files to our server
            }
        ).then(() => {
            console.log("File uploaded successfully")
        }).catch(err => {
            console.log(err);
        });

    }, []);

    const {getRootProps, getInputProps, isDragActive} = useDropzone({onDrop})

    return (
        <div {...getRootProps()}>
            <input {...getInputProps()} />
            {
                isDragActive ?
                    <p>Here?...</p> :
                    <p>Drag and drop a profile image, or click to select a profile image</p>
            }
        </div>
    )
}

function App() {
    return (
        <div className="App">
            <UserProfiles/>
        </div>
    );
}

export default App;
