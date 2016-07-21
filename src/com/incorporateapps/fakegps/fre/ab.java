package com.incorporateapps.fakegps.fre;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.Editable;
import android.widget.EditText;

final class ab
  implements DialogInterface.OnClickListener
{
  ab(Maps paramMaps, EditText paramEditText) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = b.getText().toString();
    if (!str.equals(""))
    {
      a.a(str);
      paramDialogInterface.dismiss();
    }
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.ab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */