package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Response;
import com.google.android.gms.appdatasearch.zzg;
import com.google.android.gms.common.api.Status;

public abstract class zzkg$zza
  extends Binder
  implements zzkg
{
  public zzkg$zza()
  {
    attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
  }
  
  public static zzkg zzah(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zzkg))) {
      return (zzkg)localIInterface;
    }
    return new zzkg.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza(paramParcel1);
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
      if (paramParcel1.readInt() != 0)
      {
        paramParcel2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label171;
        }
      }
      for (paramParcel1 = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza(paramParcel2, paramParcel1);
        return true;
        paramParcel2 = null;
        break;
      }
    case 3: 
      label171:
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
      if (paramParcel1.readInt() != 0)
      {
        paramParcel2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label226;
        }
      }
      label226:
      for (boolean bool = true;; bool = false)
      {
        zza(paramParcel2, bool);
        return true;
        paramParcel2 = null;
        break;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    paramParcel2 = (Parcel)localObject;
    if (paramParcel1.readInt() != 0) {
      paramParcel2 = GetRecentContextCall.Response.CREATOR.zzw(paramParcel1);
    }
    zza(paramParcel2);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkg.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */