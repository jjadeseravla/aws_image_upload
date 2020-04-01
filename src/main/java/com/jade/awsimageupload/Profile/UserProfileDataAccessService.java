package com.jade.awsimageupload.Profile;

import com.jade.awsimageupload.datastore.FakeUserProfileDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//class that interacts with db
@Repository
public class UserProfileDataAccessService {

    //dependency injection to implement an interface and switch implementation
    //so if you want to switch to a real DB you just change one line of code
    private final FakeUserProfileDB fakeUserProfileDB;

    @Autowired
    public UserProfileDataAccessService(FakeUserProfileDB fakeUserProfileDB) {
        this.fakeUserProfileDB = fakeUserProfileDB;
    }

    List<UserProfile> getUserProfiles() {
        return fakeUserProfileDB.getUserProfiles();
    }
}
