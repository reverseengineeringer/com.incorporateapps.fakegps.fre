package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class zzfp$1
  implements DialogInterface.OnClickListener
{
  zzfp$1(zzfp paramzzfp, String paramString1, String paramString2) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = (DownloadManager)zzfp.zza(zzDt).getSystemService("download");
    try
    {
      paramDialogInterface.enqueue(zzDt.zzf(zzDr, zzDs));
      return;
    }
    catch (IllegalStateException paramDialogInterface)
    {
      zzDt.zzam("Could not store picture.");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfp.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */