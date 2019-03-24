package c.lovtsova.homework;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class ScrollFragment extends Fragment {

    public static final String TAG = "ScrollFragment";
    private RecyclerView recyclerView;
    private NumberAdapter adapter;
    private ArrayList<Number> numberArrayList;
    private Button mButton;

    public static Fragment newInstance() {
        return new ScrollFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Получение ссылки на RecyclerView
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        // Определение LayoutManager для компановки элементов
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        numberArrayList = new ArrayList<>();

        adapter = new NumberAdapter(getContext(), numberArrayList);
        recyclerView.setAdapter(adapter);
        // Создание адаптера
        createListData();
        mButton = (Button) view.findViewById(R.id.btnAdd);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNewElement();
            }
        });


    }

    private void createListData() {
        int num = ((MainActivity)getActivity()).getData();
        for (int i = 0; i < num; i++) {
            numberArrayList.add(new Number(i));
        }
    }


    public void addNewElement() {
        numberArrayList.add(new Number(adapter.getItemCount()));
        adapter.notifyItemInserted(numberArrayList.size() - 1);
        ((MainActivity)getActivity()).setData(numberArrayList.size());
    }
}
