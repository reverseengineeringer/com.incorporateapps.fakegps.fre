package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzj;
import com.google.android.gms.internal.zzcr.zza;
import com.google.android.gms.internal.zzcs.zza;
import com.google.android.gms.internal.zzct.zza;
import com.google.android.gms.internal.zzcu.zza;

public abstract class zzs$zza
  extends Binder
  implements zzs
{
  public zzs$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
  }
  
  public static zzs zzi(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    if ((localIInterface != null) && ((localIInterface instanceof zzs))) {
      return (zzs)localIInterface;
    }
    return new zzs.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    zzr localzzr = null;
    Object localObject = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      localzzr = zzbn();
      paramParcel2.writeNoException();
      paramParcel1 = (Parcel)localObject;
      if (localzzr != null) {
        paramParcel1 = localzzr.asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      zzb(zzq.zza.zzg(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      zza(zzcr.zza.zzz(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      zza(zzcs.zza.zzA(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      zza(paramParcel1.readString(), zzcu.zza.zzC(paramParcel1.readStrongBinder()), zzct.zza.zzB(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      localObject = localzzr;
      if (paramParcel1.readInt() != 0) {
        localObject = NativeAdOptionsParcel.CREATOR.zze(paramParcel1);
      }
      zza((NativeAdOptionsParcel)localObject);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    zzb(zzx.zza.zzn(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzs.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */