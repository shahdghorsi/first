package com.example.recodedharran.bookshopmain;



import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.ArrayList;
import com.example.recodedharran.bookshopmain.MyModels.Books;

import static android.support.v4.content.ContextCompat.startActivity;


public class  BooksAdapter extends ArrayAdapter<Books>  {

    private static final String LOG_TAG = BooksAdapter.class.getSimpleName();

    public BooksAdapter(Activity context, ArrayList<Books> Books ) {
        super(context, 0, Books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Books bookies = getItem(position);


        TextView bookName = (TextView) listItemView.findViewById(R.id.text_one);
        TextView bookAuther = (TextView) listItemView.findViewById(R.id.text_two);
        TextView pageNumber = (TextView) listItemView.findViewById(R.id.text_three);
        TextView bestSeller =(TextView) listItemView.findViewById(R.id.textBest);

        bookAuther.setText(bookies.getBookAuthor());
        bookName.setText(bookies.getBookName());
        pageNumber.setText(bookies.getPageCast());
        if(bookies.getBestSeller()) {
            bestSeller.setText("Best Seller");
        }
        ImageView myImage=(ImageView) listItemView.findViewById(R.id.image);
        myImage.setImageResource(bookies.getCover());

        ImageView first=(ImageView)listItemView.findViewById(R.id.image);

        first.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent act=new Intent(getContext(),FirstBook.class);
               getContext().startActivity(act);
            }
        });









        return listItemView;
    }



       }
