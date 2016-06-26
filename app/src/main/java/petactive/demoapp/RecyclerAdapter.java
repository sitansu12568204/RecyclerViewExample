package petactive.demoapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.List;

/**
 * Created by Barsa on 6/26/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    View.OnClickListener onClickListner;
    private List<DataModel> dataList;
    private Context context;
    private int selectedPosition ;
    private ImageLoader imageLoader;



    public RecyclerAdapter(Context context, List<DataModel> dataList) {

        //cartChange = (CartChange)context;
        this.context = context;
        this.dataList = dataList;
        imageLoader = CustomRequestQueue.getInstance(this.context.getApplicationContext()).getImageLoader();
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_container, null);
        RecyclerView.ViewHolder rcv = new RetailProductListAdapterViewHolder(layoutView, onClickListner);

        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RetailProductListAdapterViewHolder) {
            RetailProductListAdapterViewHolder itemHolder = (RetailProductListAdapterViewHolder) holder;
            itemHolder.item_name.setText(dataList.get(position).getName());

            itemHolder.item_networkimaage.setImageUrl(dataList.get(position).getImageUrl(), imageLoader);



        }

    }


    @Override
    public int getItemCount() {
        return dataList.size();
    }



    public void setClickedPos(int clickedPos) {
        this.selectedPosition = clickedPos;
        notifyDataSetChanged();
    }



    public class RetailProductListAdapterViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

        public TextView item_name;

        private NetworkImageView item_networkimaage;

        private NetworkImageView networkItemImageView;

        public RetailProductListAdapterViewHolder(View itemView, View.OnClickListener listner) {
            super(itemView);
            item_name = (TextView) itemView.findViewById(R.id.team_name);

            item_networkimaage = (NetworkImageView) itemView.findViewById(R.id.team_logo);
            //sort_parent = (LinearLayout) itemView.findViewById(R.id.sort_parent);
            itemView.setOnClickListener(listner);
            item_name.setOnClickListener(this);
            item_networkimaage.setOnClickListener(this);



        }


        @Override
        public void onClick(View view) {
            int id = view.getId();
            switch (id)
            {
                case R.id.team_name:
                    Toast.makeText(context,"Name Clicked",Toast.LENGTH_LONG).show();

                    break;

                case R.id.team_logo:
                    Toast.makeText(context,"Image Clicked",Toast.LENGTH_LONG).show();

                    break;
            }
        }
    }
}

