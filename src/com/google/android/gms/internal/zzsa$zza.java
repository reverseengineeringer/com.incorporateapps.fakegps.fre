package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.zzc;
import com.google.android.gms.dynamic.zzc.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public abstract class zzsa$zza
  extends Binder
  implements zzsa
{
  public static zzsa zzem(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
    if ((localIInterface != null) && ((localIInterface instanceof zzsa))) {
      return (zzsa)localIInterface;
    }
    return new zzsa.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
    zzd localzzd = zzd.zza.zzbs(paramParcel1.readStrongBinder());
    zzc localzzc = zzc.zza.zzbr(paramParcel1.readStrongBinder());
    if (paramParcel1.readInt() != 0) {}
    for (Object localObject1 = (WalletFragmentOptions)WalletFragmentOptions.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      localObject1 = zza(localzzd, localzzc, (WalletFragmentOptions)localObject1, zzry.zza.zzek(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel1 = (Parcel)localObject2;
      if (localObject1 != null) {
        paramParcel1 = ((zzrx)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsa.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */