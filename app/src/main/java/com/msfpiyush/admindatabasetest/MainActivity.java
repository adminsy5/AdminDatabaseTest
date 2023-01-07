package com.msfpiyush.admindatabasetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
EditText editName,editClass,editRno;
Button btnInserted,btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShow=findViewById(R.id.btnShow);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ig=new Intent(MainActivity.this,ShowDataFromFirebaseDB.class);
                startActivity(ig);
            }
        });
    }
    public void OnClickEvent(View view)
    {
        editRno=findViewById(R.id.editRno);
        editName=findViewById(R.id.editName);
        editClass=findViewById(R.id.editClass);
        btnInserted=findViewById(R.id.btnInserted);

        String myRno=editRno.getText().toString();
        String myClass=editClass.getText().toString();
        String myName=editName.getText().toString();

        Student DataHolder=new Student(myRno,myName,myClass);

        FirebaseDatabase dbConnect=FirebaseDatabase.getInstance();
        DatabaseReference dbReference=dbConnect.getReference("SyBca");

        dbReference.child(myRno).setValue(DataHolder);

        editName.setText("");
        editClass.setText("");
        editRno.setText("");
        Toast.makeText(getApplicationContext(),"Inserted Successfully !",Toast.LENGTH_SHORT).show();
    }
}