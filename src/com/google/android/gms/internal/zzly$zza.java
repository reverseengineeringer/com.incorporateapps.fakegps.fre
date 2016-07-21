package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.zzd;

public abstract class zzly$zza
  extends Binder
  implements zzly
{
  public static zzly zzaM(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    if ((localIInterface != null) && ((localIInterface instanceof zzly))) {
      return (zzly)localIInterface;
    }
    return new zzly.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    paramParcel2 = zzlx.zza.zzaL(paramParcel1.readStrongBinder());
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = LogEventParcelable.CREATOR.zzaf(paramParcel1);; paramParcel1 = null)
    {
      zza(paramParcel2, paramParcel1);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzly.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */