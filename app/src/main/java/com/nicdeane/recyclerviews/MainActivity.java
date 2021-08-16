package com.nicdeane.recyclerviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projectsArray = {
                new Project("Pirate Colony", "Project about various pirates", R.drawable.calculator),
                new Project("Hungry Vegan", "Project about cats and chickens", R.drawable.hungry_developer),
                new Project("Elephant Run", "Project about various pirates and the weather", R.drawable.getting_started),
                new Project("This Course Sucks", "Project about Milk tasting and being gross", R.drawable.tape),
                new Project("Bring Back Trump", "Project about Donald Trump", R.drawable.quote)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projectsArray);
        list.setAdapter(adapter);




    }
}