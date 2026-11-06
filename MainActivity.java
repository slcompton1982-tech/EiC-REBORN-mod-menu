package com.example.eicreborn;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private LinearLayout content;
    private int pad = 22;

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showHome();
    }

    private TextView label(String text, int size) {
        TextView v = new TextView(this);
        v.setText(text);
        v.setTextColor(Color.WHITE);
        v.setTextSize(size);
        v.setPadding(0, 12, 0, 12);
        return v;
    }

    private Button button(String text, View.OnClickListener listener) {
        Button b = new Button(this);
        b.setText(text);
        b.setAllCaps(false);
        b.setOnClickListener(listener);
        return b;
    }

    private void base(String heading) {
        LinearLayout page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setPadding(pad, pad, pad, pad);
        page.setBackgroundColor(Color.rgb(20, 22, 30));
        TextView title = label(heading, 26);
        title.setTypeface(null, Typeface.BOLD);
        page.addView(title);
        ScrollView scroll = new ScrollView(this);
        scroll.addView(page);
        setContentView(scroll);
        content = page;
    }

    private void showHome() {
        base("EIC REBORN V2");
        content.addView(label("Standalone menu preview", 16));
        content.addView(label("This is an installable demo app. It does not connect to or modify Animal Company.", 14));
        content.addView(button("Open Mod Menu Preview", v -> showMods()));
        content.addView(button("Open Developer Tools", v -> showDeveloper()));
        content.addView(button("About / Compatibility", v -> showAbout()));
    }

    private void showMods() {
        base("Mod Menu Preview");
        content.addView(label("Example interface controls only:", 16));
        content.addView(button("Movement tab (preview)", v -> message("Movement options are UI placeholders only.")));
        content.addView(button("Spawn tab (preview)", v -> message("Spawn options are UI placeholders only.")));
        content.addView(button("Soundboard tab (preview)", v -> message("Soundboard options are UI placeholders only.")));
        content.addView(button("Back", v -> showHome()));
    }

    private void showDeveloper() {
        base("Developer Tools");
        content.addView(label("Local demo information", 16));
        content.addView(label("App version: 2.0\nBuild type: Debug\nGame connection: Not configured", 14));
        content.addView(button("Run UI test", v -> message("UI test complete.")));
        content.addView(button("Back", v -> showHome()));
    }

    private void showAbout() {
        base("About");
        content.addView(label("EIC Reborn V2 GitHub starter project", 18));
        content.addView(label("The generated APK is a standalone Android application. Installing it on a Quest does not add features inside Animal Company. In-game integration requires an authorized, compatible mod/plugin interface supplied by the game or its developers.", 14));
        content.addView(button("Back", v -> showHome()));
    }

    private void message(String text) {
        android.widget.Toast.makeText(this, text, android.widget.Toast.LENGTH_LONG).show();
    }
}
