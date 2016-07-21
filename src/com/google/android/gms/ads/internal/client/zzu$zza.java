package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.reward.client.zzd.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzcf.zza;
import com.google.android.gms.internal.zzgd.zza;
import com.google.android.gms.internal.zzgh.zza;

public abstract class zzu$zza
  extends Binder
  implements zzu
{
  public zzu$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
  }
  
  public static zzu zzk(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
    if ((localIInterface != null) && ((localIInterface instanceof zzu))) {
      return (zzu)localIInterface;
    }
    return new zzu.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    zzd localzzd = null;
    Object localObject2 = null;
    Object localObject1 = null;
    boolean bool = false;
    int j = 0;
    int i = 0;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.IAdManager");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      localzzd = zzaM();
      paramParcel2.writeNoException();
      paramParcel1 = (Parcel)localObject1;
      if (localzzd != null) {
        paramParcel1 = localzzd.asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      destroy();
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      bool = isReady();
      paramParcel2.writeNoException();
      if (bool) {}
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        return true;
      }
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      localObject1 = localzzd;
      if (paramParcel1.readInt() != 0) {
        localObject1 = AdRequestParcel.CREATOR.zzb(paramParcel1);
      }
      bool = zzb((AdRequestParcel)localObject1);
      paramParcel2.writeNoException();
      paramInt1 = i;
      if (bool) {
        paramInt1 = 1;
      }
      paramParcel2.writeInt(paramInt1);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      pause();
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      resume();
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      zza(zzq.zza.zzg(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      zza(zzw.zza.zzm(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      showInterstitial();
      paramParcel2.writeNoException();
      return true;
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      stopLoading();
      paramParcel2.writeNoException();
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      zzaP();
      paramParcel2.writeNoException();
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      paramParcel1 = zzaN();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = AdSizeParcel.CREATOR.zzc(paramParcel1);
      }
      zza((AdSizeParcel)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      zza(zzgd.zza.zzP(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      zza(zzgh.zza.zzT(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      paramParcel1 = getMediationAdapterClassName();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 19: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      zza(zzcf.zza.zzs(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 20: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      zza(zzp.zza.zzf(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 21: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      zza(zzx.zza.zzn(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 22: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if (paramParcel1.readInt() != 0) {
        bool = true;
      }
      setManualImpressionsEnabled(bool);
      paramParcel2.writeNoException();
      return true;
    case 23: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      bool = isLoading();
      paramParcel2.writeNoException();
      paramInt1 = j;
      if (bool) {
        paramInt1 = 1;
      }
      paramParcel2.writeInt(paramInt1);
      return true;
    case 24: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      zza(zzd.zza.zzac(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
    setUserId(paramParcel1.readString());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzu.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */