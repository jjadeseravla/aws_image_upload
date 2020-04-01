package com.jade.awsimageupload.datastore;

import com.jade.awsimageupload.Profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDB {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "jadealvares", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "liamtate", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
