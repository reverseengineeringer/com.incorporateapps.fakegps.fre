package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzgc;

public final class GInAppPurchaseManagerInfoParcel
  implements SafeParcelable
{
  public static final zza CREATOR = new zza();
  public final int versionCode;
  public final zzgc zzFw;
  public final Context zzFx;
  public final zzj zzFy;
  public final zzk zzrI;
  
  GInAppPurchaseManagerInfoParcel(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4)
  {
    versionCode = paramInt;
    zzrI = ((zzk)zze.zzp(zzd.zza.zzbs(paramIBinder1)));
    zzFw = ((zzgc)zze.zzp(zzd.zza.zzbs(paramIBinder2)));
    zzFx = ((Context)zze.zzp(zzd.zza.zzbs(paramIBinder3)));
    zzFy = ((zzj)zze.zzp(zzd.zza.zzbs(paramIBinder4)));
  }
  
  public GInAppPurchaseManagerInfoParcel(Context paramContext, zzk paramzzk, zzgc paramzzgc, zzj paramzzj)
  {
    versionCode = 2;
    zzFx = paramContext;
    zzrI = paramzzk;
    zzFw = paramzzgc;
    zzFy = paramzzj;
  }
  
  public static void zza(Intent paramIntent, GInAppPurchaseManagerInfoParcel paramGInAppPurchaseManagerInfoParcel)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", paramGInAppPurchaseManagerInfoParcel);
    paramIntent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", localBundle);
  }
  
  public static GInAppPurchaseManagerInfoParcel zzc(Intent paramIntent)
  {
    try
    {
      paramIntent = paramIntent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
      paramIntent.setClassLoader(GInAppPurchaseManagerInfoParcel.class.getClassLoader());
      paramIntent = (GInAppPurchaseManagerInfoParcel)paramIntent.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
      return paramIntent;
    }
    catch (Exception paramIntent) {}
    return null;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  final IBinder zzfS()
  {
    return zze.zzC(zzFy).asBinder();
  }
  
  final IBinder zzfT()
  {
    return zze.zzC(zzrI).asBinder();
  }
  
  final IBinder zzfU()
  {
    return zze.zzC(zzFw).asBinder();
  }
  
  final IBinder zzfV()
  {
    return zze.zzC(zzFx).asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */