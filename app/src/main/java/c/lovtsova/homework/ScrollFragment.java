package c.lovtsova.homework;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ScrollFragment extends Fragment {

    private RecyclerView recyclerView;
    private NumberAdapter adapter;
    private ArrayList<Number> numberArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Context context = getActivity().getApplicationContext();
        LinearLayout layout = new LinearLayout(context);

        return layout;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Получение ссылки на RecyclerView
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        // Определение LayoutManager для компановки элементов
        recyclerView.setLayoutManager(new GridLayoutManager(this.getActivity(), 3));
        numberArrayList = new ArrayList<>();

        // Создание адаптера
        adapter = new NumberAdapter(this.getActivity(), numberArrayList);
        recyclerView.setAdapter(adapter);
        createListData();
    }

    private void createListData() {
        for(int i = 0; i < 10; i++) {
            numberArrayList.add(new Number(i));
        }
    }
}
