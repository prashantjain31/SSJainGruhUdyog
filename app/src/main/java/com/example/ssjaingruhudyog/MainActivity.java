package com.example.ssjaingruhudyog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quantity_patle_sev = 0;
    int quantity_mote_sev = 0;
    int quantity_chatpataChanaDal = 0;
    int quantity_diet_mixture = 0;
    int quantity_namkeen_mixture = 0;
    int quantity_masaala_moongfali = 0;
    int quantity_illvade = 0;
    int quantity_till_muruk = 0;
    int quantity_shankarpalli = 0;
    int quantity_moongKiDalKiMangodi = 0;

    double price_patle_sev = 0.250;
    double price_mote_sev = 0.250;
    double price_chatpataChanaDal = 0.250;
    double price_diet_mixture = 0.250;
    double price_namkeen_mixture = 0.300;
    double price_masaala_moongfali = 0.300;
    double price_illvade = 0.300;
    double price_till_muruk = 0.300;
    double price_shankarpalli = 0.350;
    double price_moongKiDalKiMangodi = 0.350;

    int packing_patle_sev = 0;
    int packing_mote_sev = 0;
    int packing_chatpataChanaDal = 0;
    int packing_diet_mixture = 0;
    int packing_namkeen_mixture = 0;
    int packing_masaala_moongfali = 0;
    int packing_illvade = 0;
    int packing_till_muruk = 0;
    int packing_shankarpalli = 0;
    int packing_moongKiDalKiMangodi = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view) {
        switch (view.getId()) {
            case R.id.mote_sev_increment :
                if(quantity_mote_sev < 20)
                    quantity_mote_sev += 1;
                break;
            case R.id.patle_sev_increment :
                if(quantity_patle_sev < 20)
                    quantity_patle_sev += 1;
                break;
            case R.id.chatpataChanaDal_increment :
                if(quantity_chatpataChanaDal < 20)
                    quantity_chatpataChanaDal += 1;
                break;
            case R.id.diet_mixture_increment :
                if(quantity_diet_mixture < 20)
                    quantity_diet_mixture += 1;
                break;
            case R.id.namkeen_mixture_increment :
                if(quantity_namkeen_mixture < 20)
                    quantity_namkeen_mixture += 1;
                break;
            case R.id.masala_moongfali_increment :
                if(quantity_masaala_moongfali < 20)
                    quantity_masaala_moongfali += 1;
                break;
            case R.id.illvade_increment :
                if(quantity_illvade < 20)
                    quantity_illvade += 1;
                break;
            case R.id.til_muruk_increment :
                if(quantity_till_muruk < 20)
                    quantity_till_muruk += 1;
                break;
            case R.id.shankarpalli_increment :
                if(quantity_shankarpalli < 20)
                    quantity_shankarpalli += 1;
                break;
            case R.id.moongDalKiMangodi_increment :
                if(quantity_moongKiDalKiMangodi < 20)
                    quantity_moongKiDalKiMangodi += 1;
                break;
        }
        display(view.getId());
    }

    public void decrement(View view) {
        switch (view.getId()) {
            case R.id.mote_sev_decrement:
                if(quantity_mote_sev > 0)
                    quantity_mote_sev -= 1;
                break;
            case R.id.patle_sev_decrement:
                if(quantity_patle_sev > 0)
                    quantity_patle_sev -= 1;
                break;
            case R.id.chatpataChanaDal_decrement:
                if(quantity_chatpataChanaDal > 0)
                    quantity_chatpataChanaDal -= 1;
                break;
            case R.id.diet_mixture_decrement:
                if(quantity_diet_mixture > 0)
                    quantity_diet_mixture -= 1;
                break;
            case R.id.namkeen_mixture_decrement:
                if(quantity_namkeen_mixture > 0)
                    quantity_namkeen_mixture -= 1;
                break;
            case R.id.masala_moongfali_decrement:
                if(quantity_masaala_moongfali > 0)
                    quantity_masaala_moongfali -= 1;
                break;
            case R.id.illvade_decrement:
                if(quantity_illvade > 0)
                    quantity_illvade -= 1;
                break;
            case R.id.til_muruk_decrement:
                if(quantity_till_muruk > 0)
                    quantity_till_muruk -= 1;
                break;
            case R.id.shankarpalli_decrement:
                if(quantity_shankarpalli > 0)
                    quantity_shankarpalli -= 1;
                break;
            case R.id.moongDalKiMangodi_decrement:
                if(quantity_moongKiDalKiMangodi > 0)
                    quantity_moongKiDalKiMangodi -= 1;
                break;
        }
        display(view.getId());
    }

    private void display(int resource) {
        if(resource == R.id.mote_sev_decrement || resource == R.id.mote_sev_increment || resource == R.id.mote_sev_250g || resource == R.id.mote_sev_500g || resource == R.id.mote_sev_1kg) {
            TextView text = (TextView) findViewById(R.id.mote_sev_quantity_text_view);
            text.setText("" + quantity_mote_sev);
        }
        else if(resource == R.id.patle_sev_decrement || resource == R.id.patle_sev_increment || resource == R.id.patle_sev_250g || resource == R.id.patle_sev_500g || resource == R.id.patle_sev_1kg) {
            TextView text = (TextView) findViewById(R.id.patle_sev_quantity_text_view);
            text.setText("" + quantity_patle_sev);
        }
        else if(resource == R.id.chatpataChanaDal_decrement || resource == R.id.chatpataChanaDal_increment || resource == R.id.chatpataChanaDal_250g || resource == R.id.chatpataChanaDal_500g || resource == R.id.chatpataChanaDal_1kg) {
            TextView text = (TextView) findViewById(R.id.chatpataChanaDal_quantity_text_view);
            text.setText("" + quantity_chatpataChanaDal);
        }
        else if(resource == R.id.diet_mixture_decrement || resource == R.id.diet_mixture_increment || resource == R.id.diet_mixture_250g || resource == R.id.diet_mixture_500g || resource == R.id.diet_mixture_1kg) {
            TextView text = (TextView) findViewById(R.id.diet_mixture_quantity_text_view);
            text.setText("" + quantity_diet_mixture);
        }
        else if(resource == R.id.namkeen_mixture_decrement || resource == R.id.namkeen_mixture_increment || resource == R.id.namkeen_mixture_250g || resource == R.id.namkeen_mixture_500g || resource == R.id.namkeen_mixture_1kg) {
            TextView text = (TextView) findViewById(R.id.namkeen_mixture_quantity_text_view);
            text.setText("" + quantity_namkeen_mixture);
        }
        else if(resource == R.id.masala_moongfali_decrement || resource == R.id.masala_moongfali_increment || resource == R.id.masala_moongfali_250g || resource == R.id.masala_moongfali_500g || resource == R.id.masala_moongfali_1kg) {
            TextView text = (TextView) findViewById(R.id.masala_moongfali_quantity_text_view);
            text.setText("" + quantity_masaala_moongfali);
        }
        else if(resource == R.id.illvade_decrement || resource == R.id.illvade_increment || resource == R.id.illvade_250g || resource == R.id.illvade_500g || resource == R.id.illvade_1kg) {
            TextView text = (TextView) findViewById(R.id.illvade_quantity_text_view);
            text.setText("" + quantity_illvade);
        }
        else if(resource == R.id.til_muruk_decrement || resource == R.id.til_muruk_increment || resource == R.id.til_muruk_250g || resource == R.id.til_muruk_500g || resource == R.id.til_muruk_1kg) {
            TextView text = (TextView) findViewById(R.id.til_muruk_quantity_text_view);
            text.setText("" + quantity_till_muruk);
        }
        else if(resource == R.id.shankarpalli_decrement || resource == R.id.shankarpalli_increment || resource == R.id.shankarpalli_250g || resource == R.id.shankarpalli_500g || resource == R.id.shankarpalli_1kg) {
            TextView text = (TextView) findViewById(R.id.shankarpalli_quantity_text_view);
            text.setText("" + quantity_shankarpalli);
        }
        else if(resource == R.id.moongDalKiMangodi_decrement || resource == R.id.moongDalKiMangodi_increment || resource == R.id.moongDalKiMangodi_250g || resource == R.id.moongDalKiMangodi_500g || resource == R.id.moongDalKiMangodi_1kg) {
            TextView text = (TextView) findViewById(R.id.moongDalKiMangodi_quantity_text_view);
            text.setText("" +quantity_moongKiDalKiMangodi);
        }
    }

    public void onRadioButtonClick(View view) {
        int res = view.getId();
        if (res == R.id.patle_sev_250g || res == R.id.patle_sev_500g || res == R.id.patle_sev_1kg) {
            quantity_patle_sev = 1;
            if(res == R.id.patle_sev_250g) {
                packing_patle_sev = 250;
            }
            else if(res == R.id.patle_sev_500g) {
                packing_patle_sev = 500;
            }
            else if(res == R.id.patle_sev_1kg) {
                packing_patle_sev = 1000;
            }
        }
        else if (res == R.id.mote_sev_250g || res == R.id.mote_sev_500g || res == R.id.mote_sev_1kg) {
            quantity_mote_sev = 1;
            if(res == R.id.mote_sev_250g) {
                packing_mote_sev = 250;
            }
            else if(res == R.id.mote_sev_500g) {
                packing_mote_sev = 500;
            }
            else if(res == R.id.mote_sev_1kg) {
                packing_mote_sev = 1000;
            }
        }
        else if (res == R.id.chatpataChanaDal_250g || res == R.id.chatpataChanaDal_500g || res == R.id.chatpataChanaDal_1kg) {
            quantity_chatpataChanaDal = 1;
            if(res == R.id.chatpataChanaDal_250g) {
                packing_chatpataChanaDal = 250;
            }
            else if(res == R.id.chatpataChanaDal_500g) {
                packing_chatpataChanaDal = 500;
            }
            else if(res == R.id.chatpataChanaDal_1kg) {
                packing_chatpataChanaDal = 1000;
            }
        }
        else if (res == R.id.diet_mixture_250g || res == R.id.diet_mixture_500g || res == R.id.diet_mixture_1kg) {
            quantity_diet_mixture = 1;
            if(res == R.id.diet_mixture_250g) {
                packing_diet_mixture = 250;
            }
            else if(res == R.id.diet_mixture_500g) {
                packing_diet_mixture = 500;
            }
            else if(res == R.id.diet_mixture_1kg) {
                packing_diet_mixture = 1000;
            }
        }
        else if (res == R.id.namkeen_mixture_250g || res == R.id.namkeen_mixture_500g || res == R.id.namkeen_mixture_1kg) {
            quantity_namkeen_mixture = 1;
            if(res == R.id.namkeen_mixture_250g) {
                packing_namkeen_mixture = 250;
            }
            else if(res == R.id.namkeen_mixture_500g) {
                packing_namkeen_mixture = 500;
            }
            else if(res == R.id.namkeen_mixture_1kg) {
                packing_namkeen_mixture = 1000;
            }
        }
        else if (res == R.id.masala_moongfali_250g || res == R.id.masala_moongfali_500g || res == R.id.masala_moongfali_1kg) {
            quantity_masaala_moongfali = 1;
            if(res == R.id.masala_moongfali_250g) {
                packing_masaala_moongfali = 250;
            }
            else if(res == R.id.masala_moongfali_500g) {
                packing_masaala_moongfali = 500;
            }
            else if(res == R.id.masala_moongfali_1kg) {
                packing_masaala_moongfali = 1000;
            }
        }
        else if (res == R.id.illvade_250g || res == R.id.illvade_500g || res == R.id.illvade_1kg) {
            quantity_illvade = 1;
            if(res == R.id.illvade_250g) {
                packing_illvade = 250;
            }
            else if(res == R.id.illvade_500g) {
                packing_illvade = 500;
            }
            else if(res == R.id.illvade_1kg) {
                packing_illvade = 1000;
            }
        }
        else if (res == R.id.til_muruk_250g || res == R.id.til_muruk_500g || res == R.id.til_muruk_1kg) {
            quantity_till_muruk = 1;
            if(res == R.id.til_muruk_250g) {
                packing_till_muruk = 250;
            }
            else if(res == R.id.til_muruk_500g) {
                packing_till_muruk = 500;
            }
            else if(res == R.id.til_muruk_1kg) {
                packing_till_muruk = 1000;
            }
        }
        else if (res == R.id.shankarpalli_250g || res == R.id.shankarpalli_500g || res == R.id.shankarpalli_1kg) {
            quantity_shankarpalli = 1;
            if(res == R.id.shankarpalli_250g) {
                packing_shankarpalli = 250;
            }
            else if(res == R.id.shankarpalli_500g) {
                packing_shankarpalli = 500;
            }
            else if(res == R.id.shankarpalli_1kg) {
                packing_shankarpalli = 1000;
            }
        }
        else if (res == R.id.moongDalKiMangodi_250g || res == R.id.moongDalKiMangodi_500g || res == R.id.moongDalKiMangodi_1kg) {
            quantity_moongKiDalKiMangodi = 1;
            if(res == R.id.moongDalKiMangodi_250g) {
                packing_moongKiDalKiMangodi = 250;
            }
            else if(res == R.id.moongDalKiMangodi_500g) {
                packing_moongKiDalKiMangodi = 500;
            }
            else if(res == R.id.moongDalKiMangodi_1kg) {
                packing_moongKiDalKiMangodi = 1000;
            }
        }
        display(res);
    }

    private double calculatePrice() {
        double total = 0;
        if(quantity_patle_sev > 0){
            total += quantity_patle_sev * packing_patle_sev * price_patle_sev;
        }
        if(quantity_mote_sev > 0){
            total += quantity_mote_sev * packing_mote_sev * price_mote_sev;
        }
        if(quantity_chatpataChanaDal > 0){
            total += quantity_chatpataChanaDal * packing_chatpataChanaDal * price_chatpataChanaDal;
        }
        if(quantity_diet_mixture > 0){
            total += quantity_diet_mixture * packing_diet_mixture * price_diet_mixture;
        }
        if(quantity_namkeen_mixture > 0){
            total += quantity_namkeen_mixture * packing_namkeen_mixture * price_namkeen_mixture;
        }
        if(quantity_masaala_moongfali > 0){
            total += quantity_masaala_moongfali * packing_masaala_moongfali * price_masaala_moongfali;
        }
        if(quantity_illvade > 0){
            total += quantity_illvade * packing_illvade * price_illvade;
        }
        if(quantity_till_muruk > 0){
            total += quantity_till_muruk * packing_till_muruk * price_till_muruk;
        }
        if(quantity_shankarpalli > 0){
            total += quantity_shankarpalli * packing_shankarpalli * price_shankarpalli;
        }
        if(quantity_moongKiDalKiMangodi > 0){
            total += quantity_moongKiDalKiMangodi * packing_moongKiDalKiMangodi * price_moongKiDalKiMangodi;
        }
        return total;
    }

    private String createOrderSummary() {
        String message = "";
        double totalAmount = calculatePrice();

        EditText nameField = (EditText) findViewById(R.id.name_field);
        message += "Name: " + nameField.getText().toString();
        EditText phoneField = (EditText) findViewById(R.id.phone_field);
        message += "\nPhone No. " + phoneField.getText().toString() + "\n";
        EditText addressField = (EditText) findViewById(R.id.address_field);
        message += "\nAddress: " + addressField.getText().toString() + "\n";
        message += "\nORDER: \n";
        if(quantity_patle_sev > 0) {
            message += "\nPatle Sev: " + packing_patle_sev + "g * " + quantity_patle_sev + " Packets = Rs. " + packing_patle_sev*quantity_patle_sev*price_patle_sev;
        }
        if(quantity_mote_sev > 0) {
            message += "\nMote Sev: " + packing_mote_sev + "g * " + quantity_mote_sev + " Packets = Rs. " + packing_mote_sev*quantity_mote_sev*price_mote_sev;
        }
        if(quantity_chatpataChanaDal > 0) {
            message += "\nChatpata Chana Dal: " + packing_chatpataChanaDal + "g * " + quantity_chatpataChanaDal + " Packets = Rs. " + packing_chatpataChanaDal*quantity_chatpataChanaDal*price_chatpataChanaDal;
        }
        if(quantity_diet_mixture > 0) {
            message += "\nDiet Mixture: " + packing_diet_mixture + "g * " + quantity_diet_mixture + " Packets = Rs. " + packing_diet_mixture*quantity_diet_mixture*price_diet_mixture;
        }
        if(quantity_namkeen_mixture > 0) {
            message += "\nNamkeen Mixture: " + packing_namkeen_mixture + "g * " + quantity_namkeen_mixture + " Packets = Rs. " + packing_namkeen_mixture*quantity_namkeen_mixture*price_namkeen_mixture;
        }
        if(quantity_masaala_moongfali > 0) {
            message += "\nMasaala Moongfali: " + packing_masaala_moongfali + "g * " + quantity_masaala_moongfali + " Packets = Rs. " + packing_masaala_moongfali*quantity_masaala_moongfali*price_masaala_moongfali;
        }
        if(quantity_illvade > 0) {
            message += "\nIllvade: " + packing_illvade + "g * " + quantity_illvade + " Packets = Rs. " + packing_illvade*quantity_illvade*price_illvade;
        }
        if(quantity_till_muruk > 0) {
            message += "\nTil Muruk: " + packing_till_muruk + "g * " + quantity_till_muruk + " Packets = Rs. " + packing_till_muruk*quantity_till_muruk*price_till_muruk;
        }
        if(quantity_shankarpalli > 0) {
            message += "\nShankarpalli: " + packing_shankarpalli + "g * " + quantity_shankarpalli + " Packets = Rs. " + packing_shankarpalli*quantity_shankarpalli*price_shankarpalli ;
        }
        if(quantity_moongKiDalKiMangodi > 0) {
            message += "\nMoong Ki Dal Ki Mangodi: " + packing_moongKiDalKiMangodi + "g * " + quantity_moongKiDalKiMangodi + " Packets = Rs. " + packing_moongKiDalKiMangodi*quantity_moongKiDalKiMangodi*price_moongKiDalKiMangodi;
        }

        message += "\n\nTotal: Rs." + totalAmount +" only";
        return message;
    }

    public void displayOrderSummary(View view) {
        String Message = createOrderSummary();
        Message += "\nThank You";
        TextView order_summary = (TextView) findViewById(R.id.order_summary_text_view);
        order_summary.setText(Message);
    }

    public void createEmail(View view) {
        String emailMessage = createOrderSummary();
        emailMessage += "\n\n\n!!!IF YOU WANT TO SAY SOMETHING OR IF YOU WANT TO GIVE US ANY SUGGESTIONS, PLEASE MENTION THEM BELOW!!!\n\n";
        String[] TO = {"me.prashantjn@gmail.com"};
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Order");
        emailIntent.putExtra(Intent.EXTRA_TEXT, emailMessage);

        if (emailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(emailIntent);
        }
        else {
            Toast.makeText(MainActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }

    public void contactUs(View view) {
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
        phoneIntent.setData(Uri.parse("tel:" + "+919711877902"));
        if (phoneIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(phoneIntent);
        }
        else {
            Toast.makeText(MainActivity.this, "There is no phone client installed.", Toast.LENGTH_SHORT).show();
        }
    }

}