package com.example.intenciones_ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void paginaWeb(View view) {
		Intent intent = new Intent(Intent.ACTION_VIEW,
				Uri.parse("https://elorrieta.hezkuntza.net/es/inicio"));
		startActivity(intent);
	}

	public void llamadaTelefono(View view) {
		Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:944028000"));
		startActivity(intent);
	}

	public void googleMaps(View view) {
		Intent intent = new Intent(Intent.ACTION_VIEW,
				Uri.parse("geo:43.2840966,-2.9653554"));
		startActivity(intent);
	}

	public void hacerFoto(View view) {
		Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		startActivity(intent);
	}

	public void mandarCorreo(View view) {
		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("text/plain");
		intent.putExtra(Intent.EXTRA_SUBJECT, "asunto_Android");
		intent.putExtra(Intent.EXTRA_TEXT, "Mensaje para Cristian");
		intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"cristian.fernandezro@elorrieta-errekamari.com "});
		startActivity(intent);

	}
}