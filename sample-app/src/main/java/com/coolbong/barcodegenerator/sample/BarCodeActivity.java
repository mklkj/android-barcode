package com.coolbong.barcodegenerator.sample;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

import com.coolbong.barcodegenerator.model.Code128;
import com.coolbong.barcodegenerator.model.EAN13;

public class BarCodeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_code);

        drawCode128(findViewById(R.id.code128_barcode));
        drawEan13(findViewById(R.id.ean13_barcode));
    }

    private void drawCode128(ImageView ivBarcode) {
        String barcode = "7761010114033430";
        Code128 code = new Code128(barcode);
        ivBarcode.post(() -> {
            Bitmap bitmap = code.getBitmap(ivBarcode.getMeasuredWidth(), ivBarcode.getMeasuredHeight(), false);
            ivBarcode.setImageBitmap(bitmap);
        });
    }

    private void drawEan13(ImageView ivBarcode) {
        String barcode = "5903609121594";
        EAN13 code = new EAN13();
        code.setData(barcode);
        ivBarcode.post(() -> {
            Bitmap bitmap = code.getBitmap(ivBarcode.getMeasuredWidth(), ivBarcode.getMeasuredHeight());
            ivBarcode.setImageBitmap(bitmap);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_bar_code, menu);
        return true;
    }
}
