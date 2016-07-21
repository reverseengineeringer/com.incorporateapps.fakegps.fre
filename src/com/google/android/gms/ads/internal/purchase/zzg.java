package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzgg.zza;
import com.google.android.gms.internal.zzin;

public final class zzg
  extends zzgg.zza
  implements ServiceConnection
{
  private Context mContext;
  zzb zzFC;
  private String zzFI;
  private zzf zzFM;
  private boolean zzFS = false;
  private int zzFT;
  private Intent zzFU;
  
  public zzg(Context paramContext, String paramString, boolean paramBoolean, int paramInt, Intent paramIntent, zzf paramzzf)
  {
    zzFI = paramString;
    zzFT = paramInt;
    zzFU = paramIntent;
    zzFS = paramBoolean;
    mContext = paramContext;
    zzFM = paramzzf;
  }
  
  public final void finishPurchase()
  {
    int i = zzr.zzbM().zzd(zzFU);
    if ((zzFT != -1) || (i != 0)) {
      return;
    }
    zzFC = new zzb(mContext);
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    localIntent.setPackage("com.android.vending");
    com.google.android.gms.common.stats.zzb.zzrP().zza(mContext, localIntent, this, 1);
  }
  
  public final String getProductId()
  {
    return zzFI;
  }
  
  public final Intent getPurchaseData()
  {
    return zzFU;
  }
  
  public final int getResultCode()
  {
    return zzFT;
  }
  
  public final boolean isVerified()
  {
    return zzFS;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    zzin.zzaJ("In-app billing service connected.");
    zzFC.zzN(paramIBinder);
    paramComponentName = zzr.zzbM().zze(zzFU);
    paramComponentName = zzr.zzbM().zzar(paramComponentName);
    if (paramComponentName == null) {
      return;
    }
    if (zzFC.zzh(mContext.getPackageName(), paramComponentName) == 0) {
      zzh.zzy(mContext).zza(zzFM);
    }
    com.google.android.gms.common.stats.zzb.zzrP().zza(mContext, this);
    zzFC.destroy();
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    zzin.zzaJ("In-app billing service disconnected.");
    zzFC.destroy();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */