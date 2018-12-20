package ru.androidacademy.msk.lists;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import ru.androidacademy.msk.lists.data.DataUtils;

public class ActorListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actor_list);

        ListView list = findViewById(R.id.list);

        ActorListAdapter adapter = new ActorListAdapter(this, DataUtils.generateActors());
        list.setAdapter(adapter);
    }

}
