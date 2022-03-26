package com.example.rider;

import static com.example.rider.RegisterActivity.TAG;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class AcceptedRequest extends AppCompatActivity {
    TextView successUsername;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userID;
    Button homeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accepted_request);
        fAuth = FirebaseAuth.getInstance();
        homeBtn = findViewById(R.id.homeBtn_id);
        fStore  = FirebaseFirestore.getInstance();
        userID = fAuth.getCurrentUser().getUid();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if(user != null){
            Log.d(TAG, "onCreate: \"+user.getDisplayName()");
        }

        successUsername = findViewById(R.id.successUsername_id);
        DocumentReference documentReference = fStore.collection("users").document(userID);
        documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                successUsername.setText(documentSnapshot.getString("firstName"));
            }
        });
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(AcceptedRequest.this, VolunteerSideNavBar.class);
                startActivity(intent);
            }
        });

    }
}