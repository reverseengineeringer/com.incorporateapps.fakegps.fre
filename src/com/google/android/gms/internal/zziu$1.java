package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzr;

class zziu$1
  implements DialogInterface.OnClickListener
{
  zziu$1(zziu paramzziu, String paramString) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    zzr.zzbC().zzb(zziu.zza(zzMm), Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", zzMl), "Share via"));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zziu.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */