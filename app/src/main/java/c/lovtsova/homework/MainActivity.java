package c.lovtsova.homework;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            // получаем экземпляр FragmentTransaction
            mFragmentManager = getFragmentManager();
            mFragmentTransaction = mFragmentManager.beginTransaction();

            // добавляем фрагмент
            ScrollFragment myFragment = new ScrollFragment();
            mFragmentTransaction.add(R.id.container, myFragment);
            mFragmentTransaction.commit();
        }

    }

    //public void addNewElement(View v) {
    //    numberArrayList.add(new Number(adapter.getItemCount()));
    //    adapter.notifyItemInserted(numberArrayList.size() - 1);
    //w}

}
