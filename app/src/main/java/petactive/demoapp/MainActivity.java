package petactive.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this, getDataList());

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.mainRecycler);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerAdapter);
    }

    private List<DataModel> getDataList()
    {
        List<DataModel> dataList = new ArrayList<>();
        dataList.add(new DataModel("https://upload.wikimedia.org/wikipedia/en/thumb/4/42/Royal_Challengers_Bangalore_Logo.svg/878px-Royal_Challengers_Bangalore_Logo.svg.png","Royal Challenger Bangalore"));

        dataList.add(new DataModel("https://pbs.twimg.com/profile_images/443585495600070657/xHdOs1GM_400x400.jpeg","Delhi Daredevil"));
        dataList.add(new DataModel("http://www.thenewsteller.com/wp-content/uploads/2016/04/KKR-IPL-2016.jpg","kolkata knight riders"));
        dataList.add(new DataModel("https://pbs.twimg.com/profile_images/715928945443479552/UXEw1alv.jpg","pune supergiants"));
        dataList.add(new DataModel("http://matchpredictions.in/wp-content/uploads/2016/02/Gujarat-Lions-Team-Squad-GL-Player-List-IPL-9th-2016.jpg","gujarat lions"));
        dataList.add(new DataModel("https://lh5.googleusercontent.com/-PZRuU9djInQ/AAAAAAAAAAI/AAAAAAAAASA/IZVJhE2JmWs/s0-c-k-no-ns/photo.jpg","mumbai indians"));
        dataList.add(new DataModel("https://lh6.googleusercontent.com/-DbcH3Nc7Bv8/AAAAAAAAAAI/AAAAAAAA9V4/j-F27dtmkAE/s0-c-k-no-ns/photo.jpg","kings xi punjab"));
        dataList.add(new DataModel("https://lh6.googleusercontent.com/-Imb9movvoI4/AAAAAAAAAAI/AAAAAAAAAOo/VWLdxoH3Lms/s0-c-k-no-ns/photo.jpg","sunrisers hyderabad"));

        return dataList;


    }


}