package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;

public abstract class zzrh$zza
  extends Binder
  implements zzrh
{
  public zzrh$zza()
  {
    attachInterface(this, "com.google.android.gms.search.internal.ISearchAuthCallbacks");
  }
  
  public static zzrh zzdX(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zzrh))) {
      return (zzrh)localIInterface;
    }
    return new zzrh.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.search.internal.ISearchAuthCallbacks");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.search.internal.ISearchAuthCallbacks");
      if (paramParcel1.readInt() != 0)
      {
        paramParcel2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label113;
        }
      }
      label113:
      for (paramParcel1 = (GoogleNowAuthState)GoogleNowAuthState.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza(paramParcel2, paramParcel1);
        return true;
        paramParcel2 = null;
        break;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.search.internal.ISearchAuthCallbacks");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zzbj(paramParcel1);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrh.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */