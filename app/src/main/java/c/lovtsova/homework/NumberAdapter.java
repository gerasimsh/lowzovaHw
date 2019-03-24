package c.lovtsova.homework;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class NumberAdapter extends RecyclerView.Adapter<NumberHolder> {

    private Context context;
    private ArrayList<Number> numbers;
    private BaseCallback mCallback;


    public NumberAdapter(Context context, ArrayList<Number> numbers) {

        this.context = context;
        this.numbers = numbers;
        this.mCallback= (BaseCallback) context;
    }

    // Вызывается, когда кастомный ViewHolder должен быть инициализирован
    @NonNull
    @Override
    public NumberHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // С помощью inflate заполняем макет
        View view = LayoutInflater.from(context).inflate(R.layout.item, viewGroup, false);
        // Вызываем конструктор ViewHolden
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("FAAAK","simd");
                mCallback.replaceFragmentUserAgr(WindowFragment.newInstance(), WindowFragment.TAG);

            }
        });
        return new NumberHolder(view);
    }

    // Определение содержания каждого элемента
    @Override
    public void onBindViewHolder(@NonNull NumberHolder numberHolder, int i) {
        Number number = numbers.get(i);
        numberHolder.setDetails(number);

    }

    // Возвращает кол-во элементов, присутствующих в данных
    @Override
    public int getItemCount() {
        return numbers.size();
    }


}
