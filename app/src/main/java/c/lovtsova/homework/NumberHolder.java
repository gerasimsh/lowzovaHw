package c.lovtsova.homework;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NumberHolder extends RecyclerView.ViewHolder {

    private TextView txtNumber;

    public NumberHolder(@NonNull View itemView) {
        super(itemView);
        txtNumber = itemView.findViewById(R.id.txtNumber);
    }

    public void setDetails(Number number) {
        txtNumber.setText(number.getNumber() + "");
        txtNumber.setTextColor(number.getColor());
    }

}
