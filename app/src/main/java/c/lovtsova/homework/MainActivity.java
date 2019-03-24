package c.lovtsova.homework;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BaseCallback {

    private int data=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // получаем экземпляр FragmentTransaction



        Fragment currentFragment = getSupportFragmentManager().findFragmentById(R.id.container);
        if (currentFragment == null || !(currentFragment instanceof ScrollFragment))
            replaceFragment(ScrollFragment.newInstance(), ScrollFragment.TAG);
        // добавляем фрагмент
           }

    public void replaceFragment(Fragment fragment, String tag) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment, tag)
                .addToBackStack(tag)
                .commit();
    }


    @Override
    public void replaceFragmentUserAgr(Fragment fragment, String tag) {
        replaceFragment(fragment, tag);
    }
    public int getData(){
        return this.data;
    }

    public void setData(int data){
        this.data = data;
    }
}
