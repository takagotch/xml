package net.tky.xmllayoutex;
import
import

public class XMLLayoutEx extends Activity
  implements View.OnClickListener{
  private Button button;
  private ImageButton imageButton;

  public void onCreate(Bundle bundle){
    super.onCreate(bundle);
    requestWindowFeature(Window.FEATURE_NO_TITLE);

    setContentView(R.layout.sample);

    button = (Button)this.findViewById(R.id.button);
    button.setOnClickListener(this);
    imageButton = (ImageButton)this.findViewById(R.id.imageButton);
    imageButton.setOnClickListener(this);
  }

  public void onClick(View view){
    if(view == button){
      toast("PUSH BTN");
    }
    else if(view == imageButton){
      toast("PUSH I-BTN");
    }
  }

  private void toast(String text){
    Toast.makeText(this, text, Toast.LENGTH_LONG).show();
  }
}

