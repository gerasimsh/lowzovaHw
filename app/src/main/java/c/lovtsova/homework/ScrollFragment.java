package c.lovtsova.homework;

import android.content.Context;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class ScrollFragment extends Fragment {

    public static final String TAG = "ScrollFragment";
    private RecyclerView recyclerView;
    private NumberAdapter adapter;
    private ArrayList<Number> numberArrayList;

    public static Fragment newInstance() {
        return new ScrollFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment,container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Получение ссылки на RecyclerView
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        // Определение LayoutManager для компановки элементов
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        numberArrayList = new ArrayList<>();
        recyclerView.setAdapter(new NumberAdapter(getContext(), numberArrayList));

        // Создание адаптера
        createListData();
    }

    private void createListData() {
        for(int i = 0; i < 10; i++) {
            numberArrayList.add(new Number(i));
        }
    }
}
