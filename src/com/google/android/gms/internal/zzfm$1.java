package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.gms.ads.internal.zzr;

class zzfm$1
  implements DialogInterface.OnClickListener
{
  zzfm$1(zzfm paramzzfm) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = zzCZ.createIntent();
    zzr.zzbC().zzb(zzfm.zza(zzCZ), paramDialogInterface);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfm.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */