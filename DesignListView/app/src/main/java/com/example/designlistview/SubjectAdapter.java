package com.example.designlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SubjectAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Subject> subjectList;

    public SubjectAdapter(Context context, int layout, List<Subject> subjectList) {
        this.context = context;
        this.layout = layout;
        this.subjectList = subjectList;
    }

    @Override
    public int getCount() {
        return subjectList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(layout,null);
        TextView txtName = (TextView) view.findViewById(R.id.subjectname);
        TextView txtDescription = (TextView) view.findViewById(R.id.description);
        ImageView img = (ImageView) view.findViewById(R.id.image);
        Subject subject = subjectList.get(i);
        txtName.setText(subject.getName());
        txtDescription.setText(subject.getDescription());
        img.setImageResource(subject.getSourceOfPicture());
        return view;
    }
}
