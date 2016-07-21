package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zzfb$zza
  extends Binder
  implements zzfb
{
  public zzfb$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
  }
  
  public static zzfb zzI(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    if ((localIInterface != null) && ((localIInterface instanceof zzfb))) {
      return (zzfb)localIInterface;
    }
    return new zzfb.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int j = 0;
    int i = 0;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      paramParcel1 = getHeadline();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      paramParcel1 = getImages();
      paramParcel2.writeNoException();
      paramParcel2.writeList(paramParcel1);
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      paramParcel1 = getBody();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      paramParcel1 = zzdK();
      paramParcel2.writeNoException();
      if (paramParcel1 != null) {}
      for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
      {
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      }
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      paramParcel1 = getCallToAction();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      double d = getStarRating();
      paramParcel2.writeNoException();
      paramParcel2.writeDouble(d);
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      paramParcel1 = getStore();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      paramParcel1 = getPrice();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      recordImpression();
      paramParcel2.writeNoException();
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      zzc(zzd.zza.zzbs(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      zzd(zzd.zza.zzbs(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      bool = getOverrideImpressionRecording();
      paramParcel2.writeNoException();
      paramInt1 = i;
      if (bool) {
        paramInt1 = 1;
      }
      paramParcel2.writeInt(paramInt1);
      return true;
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      bool = getOverrideClickHandling();
      paramParcel2.writeNoException();
      paramInt1 = j;
      if (bool) {
        paramInt1 = 1;
      }
      paramParcel2.writeInt(paramInt1);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    paramParcel1 = getExtras();
    paramParcel2.writeNoException();
    if (paramParcel1 != null)
    {
      paramParcel2.writeInt(1);
      paramParcel1.writeToParcel(paramParcel2, 1);
      return true;
    }
    paramParcel2.writeInt(0);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfb.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */