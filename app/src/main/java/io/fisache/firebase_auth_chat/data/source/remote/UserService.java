package io.fisache.firebase_auth_chat.data.source.remote;

import android.app.Application;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import io.fisache.firebase_auth_chat.data.model.User;

public class UserService {
    private Application application;
    private DatabaseReference databaseRef;

    public UserService(Application application) {
        this.application = application;
        this.databaseRef = FirebaseDatabase.getInstance().getReference();
    }

    public void createUser(User user) {
        databaseRef.child("users").child(user.getUid()).setValue(user);
    }

    public DatabaseReference getUser(String userUid) {
        return databaseRef.child("users").child(userUid);
    }

    public void updateUser(User user) {

    }

    public void deleteUser(String key) {

    }
}