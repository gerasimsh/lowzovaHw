package c.lovtsova.homework;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class WindowFragment extends Fragment {
    public static final String TAG = "WindowFragment";
    private static Number mNumber;

    public static Fragment newInstance(Number number) {
        mNumber = number;
        return new WindowFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_new, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Button button = (Button) view.findViewById(R.id.btn_huyzton);
        //button.setText(toString(mNumber.getNumber()));
        button.setText(String.valueOf(mNumber.getNumber()));
        super.onViewCreated(view, savedInstanceState);
    }
}
