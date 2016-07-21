package com.google.android.gms.playlog.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zza$zza
  extends Binder
  implements zza
{
  public static zza zzdN(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.playlog.internal.IPlayLogService");
    if ((localIInterface != null) && ((localIInterface instanceof zza))) {
      return (zza)localIInterface;
    }
    return new zza.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    String str = null;
    Object localObject2 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.playlog.internal.IPlayLogService");
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
      str = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel2 = PlayLoggerContext.CREATOR.zzgz(paramParcel1);; paramParcel2 = null)
      {
        if (paramParcel1.readInt() != 0) {
          localObject1 = LogEvent.CREATOR.zzgy(paramParcel1);
        }
        zza(str, paramParcel2, (LogEvent)localObject1);
        return true;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
      localObject1 = paramParcel1.readString();
      paramParcel2 = str;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = PlayLoggerContext.CREATOR.zzgz(paramParcel1);
      }
      zza((String)localObject1, paramParcel2, paramParcel1.createTypedArrayList(LogEvent.CREATOR));
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
    localObject1 = paramParcel1.readString();
    paramParcel2 = (Parcel)localObject2;
    if (paramParcel1.readInt() != 0) {
      paramParcel2 = PlayLoggerContext.CREATOR.zzgz(paramParcel1);
    }
    zza((String)localObject1, paramParcel2, paramParcel1.createByteArray());
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.playlog.internal.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */